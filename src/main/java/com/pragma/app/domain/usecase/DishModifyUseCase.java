package com.pragma.app.domain.usecase;

import com.pragma.app.domain.api.ServiceRestaurantDishPort;
import com.pragma.app.domain.exception.InvalidData;
import com.pragma.app.domain.exception.InvalidFieldModification;
import com.pragma.app.domain.model.DishModel;
import com.pragma.app.domain.spi.PersistenceRestaurantDishPort;

public class DishModifyUseCase implements ServiceRestaurantDishPort {

    private final PersistenceRestaurantDishPort persistenceRestaurantDish;

    public DishModifyUseCase(PersistenceRestaurantDishPort persistenceRestaurantDish) {
        this.persistenceRestaurantDish = persistenceRestaurantDish;
    }

    @Override
    public DishModel modifyDish(DishModel dishModel) {

        if (dishModel.getDescription() == null && dishModel.getPrice() == null) {
            throw new InvalidFieldModification("this field is not allowed to be modified");
        }
        if (dishModel.getDescription().matches("[a-zA-Z]+")) {
            throw new InvalidData("Invalid dish description");
        }
        if (dishModel.getPrice() <=0) {
            throw new InvalidData("Invalid price");
        }
        String priceS= String.valueOf(dishModel.getPrice());
        if (!priceS.matches("\\d+")) {
            throw new InvalidData("Invalid price: price must be a valid number");
        }
        return persistenceRestaurantDish.modifyDishPersistence(dishModel);
    }
}


