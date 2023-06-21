package com.pragma.app.domain.usecase;

import com.pragma.app.domain.api.IRestaurantServicePort;
import com.pragma.app.domain.exception.ObjectNotFound;
import com.pragma.app.domain.model.RestaurantModel;
import com.pragma.app.domain.spi.IRestaurantPersistencePort;

public class AdminUseCase implements IRestaurantServicePort {

    private final IRestaurantPersistencePort restaurantPersistence;

    public AdminUseCase(IRestaurantPersistencePort restaurantPersistence) {
        this.restaurantPersistence = restaurantPersistence;
    }

    @Override
    public void createRestaurant(RestaurantModel restaurantModel) {
        validateRestaurantFields(restaurantModel);
        validateOwnerRole(restaurantModel.getIdOwner());
        validateNit(restaurantModel.getNit());
        validateCellPhoneRestaurant(restaurantModel.getCellPhoneRestaurant());

        restaurantPersistence.createRestaurant(restaurantModel);
    }

    private void validateRestaurantFields(RestaurantModel restaurantModel) {
        validateRequiredField(restaurantModel.getName(), "The name of the restaurant is required");
        validateRequiredField(restaurantModel.getNit(), "The NIT of the restaurant is mandatory");
        validateRequiredField(restaurantModel.getAddress(), "The address of the restaurant is mandatory");
        validateRequiredField(restaurantModel.getCellPhoneRestaurant(), "The restaurant's telephone number is mandatory");
        validateRequiredField(restaurantModel.getUrlLogo(), "The URL of the restaurant logo is mandatory");
        validateRequiredField(String.valueOf(restaurantModel.getIdOwner()), "Owner ID is required");
    }

    private void validateRequiredField(String field, String errorMessage) {
        if (field == null || field.isEmpty()) {
            throw new IllegalArgumentException(errorMessage);
        }
    }

    private void validateOwnerRole(Long ownerId) {
        if (!isOwner(ownerId)) {
            throw new ObjectNotFound("The user does not have permissions to create a restaurant");
        }
    }

    private void validateNit(String nit) {
        if (!nit.matches("\\d+")) {
            throw new IllegalArgumentException("The NIT must contain only numeric");
        }
    }

    private void validateCellPhoneRestaurant(String cellPhone) {
        validateNumeric(cellPhone);
        validateMaxLength(cellPhone);
    }

    private void validateNumeric(String value) {
        if (!value.matches("\\+?\\d+")) {
            throw new IllegalArgumentException("The restaurant's telephone number must be numeric.");
        }
    }

    private void validateMaxLength(String value) {
        if (value.length() > 13) {
            throw new IllegalArgumentException("The restaurant's telephone number must have a maximum of 13 characters.");
        }
    }

    private boolean isOwner(Long userId){
        return userId.equals(1L);
    }
}
