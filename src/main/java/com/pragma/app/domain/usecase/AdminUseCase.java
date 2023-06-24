package com.pragma.app.domain.usecase;

import com.pragma.app.domain.api.IRestaurantServicePort;
import com.pragma.app.domain.exception.InvalidDataException;
import com.pragma.app.domain.model.RestaurantModel;
import com.pragma.app.domain.spi.IRestaurantPersistencePort;

public class AdminUseCase implements IRestaurantServicePort {

    private final IRestaurantPersistencePort restaurantPersistence;

    public AdminUseCase(IRestaurantPersistencePort restaurantPersistence) {
        this.restaurantPersistence = restaurantPersistence;
    }

    @Override
    public RestaurantModel saveRestaurant(RestaurantModel restaurantModel) {

        validateIfCellPhoneRestaurantContainsOnlyNumbers(restaurantModel.getCellPhoneRestaurant());

        if(restaurantModel.getAddress() == null ){
            throw new InvalidDataException("Fields required");
        }

        if(!restaurantModel.getNit().matches("\\d+")) {
            throw new InvalidDataException("The NIT must contain only numeric");
        }

        restaurantPersistence.saveRestaurantPersistence(restaurantModel);
        return  restaurantModel;
    }

    private void validateIfCellPhoneRestaurantContainsOnlyNumbers(String cellPhoneRestaurant) {
        if(!cellPhoneRestaurant.matches("\\d+")) {
            throw new InvalidDataException("The cell phone field must contain only numbers");
        }
    }
}