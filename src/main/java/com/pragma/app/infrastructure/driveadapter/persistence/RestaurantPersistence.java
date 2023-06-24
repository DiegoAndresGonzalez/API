package com.pragma.app.infrastructure.driveadapter.persistence;

import com.pragma.app.infrastructure.driveadapter.entity.RestaurantEntity;
import com.pragma.app.infrastructure.driveadapter.repository.IRestaurantRepository;

public class RestaurantPersistence implements IRestaurantPersistence {

    private final IRestaurantRepository restaurantRepository;

    public RestaurantPersistence(IRestaurantRepository restaurantRepository) {
        this.restaurantRepository = restaurantRepository;
    }

    @Override
    public RestaurantEntity saveRestaurantPersistence(RestaurantEntity restaurantEntity){
        return restaurantRepository.save(restaurantEntity);
    }
}
