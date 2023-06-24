package com.pragma.app.infrastructure.drivenadapter.repository;

import com.pragma.app.domain.model.RestaurantModel;

public interface IRestaurantRepository {

    RestaurantModel saveNewRestaurant(RestaurantModel restaurantModel);
}
