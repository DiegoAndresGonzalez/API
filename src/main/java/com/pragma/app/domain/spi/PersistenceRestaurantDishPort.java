package com.pragma.app.domain.spi;

import com.pragma.app.domain.model.DishModel;

public interface PersistenceRestaurantDishPort {
    DishModel modifyDishPersistence(DishModel dishModel);

}
