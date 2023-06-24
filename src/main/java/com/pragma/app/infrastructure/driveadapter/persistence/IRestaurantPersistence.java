package com.pragma.app.infrastructure.driveadapter.persistence;

import com.pragma.app.domain.model.RestaurantModel;

public interface IRestaurantPersistence {

    RestaurantModel saveRestaurantPersistence(RestaurantModel restaurantModel);
}
