package com.pragma.app.domain.usecase;

import com.pragma.app.domain.api.IDishServicePort;
import com.pragma.app.domain.exception.InvalidDataException;
import com.pragma.app.domain.model.DishModel;
import com.pragma.app.domain.spi.IDishPersistencePort;

public class OwnerUseCase implements IDishServicePort {

    private final IDishPersistencePort dishPersistence;

    public OwnerUseCase(IDishPersistencePort dishPersistence) {
        this.dishPersistence = dishPersistence;
    }

    @Override
    public DishModel saveDish(DishModel dishModel) {

        if (dishModel.getName() == null) {
            throw new InvalidDataException("Dish's name can't be blank, please introduce a name.");
        }
        if (dishModel.getIdRestaurant() == null) {
            throw new InvalidDataException("Restaurant's ID can't be blank, please introduce a Restaurant ID.");
        }
        if (dishModel.getPrice() == null || dishModel.getPrice() <= 0) {
            throw new InvalidDataException("Dish's price can't be blank, lower or same than 0");
        }
        if (dishModel.getUrlImage() == null){
            throw new InvalidDataException("Dish's portrait can't be blank, please add an image of it.");
        }
        if (dishModel.getDescription() == null) {
            throw new InvalidDataException("Dish's description can't be blank, please add a description.");
        }
        if (dishModel.getCategory() == null) {
            throw new InvalidDataException("Dish's category can't be blank, please introduce a category for the dish.");
        }
        dishModel.setActive(true);
        return dishPersistence.saveDishPersistence(dishModel);
    }
}