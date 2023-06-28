package com.pragma.app.domain.usecase;

import com.pragma.app.domain.api.ServiceRestaurantDishPort;
import com.pragma.app.domain.exception.InvalidData;
import com.pragma.app.domain.exception.InvalidFieldModification;
import com.pragma.app.domain.model.DishModel;
public class dishModifyUseCase implements ServiceRestaurantDishPort {

    @Override
    public DishModel modifyDish(DishModel dishModel) {

        validateDishDescriptionIsValid(dishModel.getDescription());
        validateDishPriceIsValid(dishModel.getPrice());

        if (dishModel.getDescription() == null && dishModel.getPrice() == null) {
            throw new InvalidFieldModification("this field is not allowed to be modified");
            }

        return dishModel;
    }
    private void validateDishDescriptionIsValid(String description) {
        if (!description.matches("[a-zA-Z]+")) {
            throw new InvalidData("Invalid dish description");
        }
    }

    private void validateDishPriceIsValid(Integer price) {
        if (price < 0) {
            throw new InvalidData("Invalid price");
        }
        String priceS= String.valueOf(price);
        if (priceS.matches("\\d+")) {
            throw new InvalidData("Invalid price: price must be a valid number");
        }
    }
}


