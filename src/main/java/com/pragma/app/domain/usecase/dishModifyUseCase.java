package com.pragma.app.domain.usecase;

import com.pragma.app.domain.api.ServiceRestaurantDishPort;
import com.pragma.app.domain.exception.InvalidData;
import com.pragma.app.domain.exception.InvalidFieldModification;
import com.pragma.app.domain.model.DishModel;
import com.pragma.app.domain.spi.PersistenceRestaurantDishPort;

public class dishModifyUseCase implements ServiceRestaurantDishPort {
    private final PersistenceRestaurantDishPort persistenceRestaurantDishPort;

    public dishModifyUseCase(PersistenceRestaurantDishPort persistenceRestaurantDishPort) {
        this.persistenceRestaurantDishPort = persistenceRestaurantDishPort;
    }

    @Override
    public DishModel modifyDish(DishModel dishModel) {
        if (dishModel.getDescription() != null && dishModel.getPrice() != null) {
            throw new InvalidFieldModification("this field is not allowed to be modified");
            }

        persistenceRestaurantDishPort.modifyDish(dishModel);
        return dishModel;
    }

}
