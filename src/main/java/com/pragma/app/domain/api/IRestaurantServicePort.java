package com.pragma.app.domain.api;

import com.pragma.app.domain.model.RestaurantModel;

public interface IRestaurantServicePort {
    RestaurantModel saveRestaurant(RestaurantModel restaurantModel);
}
