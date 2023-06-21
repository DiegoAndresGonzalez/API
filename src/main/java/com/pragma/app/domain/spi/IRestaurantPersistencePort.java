package com.pragma.app.domain.spi;

import com.pragma.app.domain.model.RestaurantModel;

public interface IRestaurantPersistencePort {
    void createRestaurantPersistence(RestaurantModel restaurantModel);
}
