package com.pragma.app.domain.spi;

import com.pragma.app.domain.model.DishModel;

public interface IDishPersistencePort {
    DishModel saveDishPersistence(DishModel dishModel);
}
