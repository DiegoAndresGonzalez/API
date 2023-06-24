package com.pragma.app.infrastructure.driveadapter.repository;

import com.pragma.app.domain.model.RestaurantModel;

public interface IRestaurantRepository {

    RestaurantModel saveNewRestaurant(RestaurantModel restaurantModel);
}
