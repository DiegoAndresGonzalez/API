package com.pragma.app.domain.api;

import com.pragma.app.domain.model.DishModel;

public interface IDishServicePort {
    DishModel saveDish(DishModel dishModel);
}