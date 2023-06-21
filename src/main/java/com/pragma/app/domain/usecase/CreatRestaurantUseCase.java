package com.pragma.app.domain.usecase;

import com.pragma.app.domain.model.Restaurant;
import com.pragma.app.domain.spi.external.RestaurantRepository;

public class CreatRestaurantUseCase {

    private final RestaurantRepository restaurantRepository;

    public CreatRestaurantUseCase(RestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    public Restaurant creatRestaurant(Restaurant restaurant){

        int rolOwner = 1;
        int idOwner = restaurant.getIdOwner();
        if(idOwner != rolOwner){
            throw new RuntimeException("The user does not have permission to create a restaurant");
        }

        if(!restaurant.getNit().matches("\\d+")){
            throw new RuntimeException("The nit must be numerical");
        }

        if(!restaurant.getCellPhoneRestaurant().matches("[\\d+]")){
            throw new RuntimeException("The restaurant's telephone number must be numeric");
        }

        if(restaurant.getCellPhoneRestaurant().length() > 13){
            throw new RuntimeException("the restaurant's phone number must be at most 13 characters long");
        }

        Restaurant newRestaurant = restaurantRepository.save(restaurant);

        return newRestaurant;
    }
}
