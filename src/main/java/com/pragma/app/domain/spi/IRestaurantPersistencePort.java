package com.pragma.app.domain.spi;

import com.pragma.app.domain.model.RestaurantModel;

public interface IRestaurantPersistencePort {
    RestaurantModel saveRestaurantPersistence(RestaurantModel restaurantModel);
}
