package com.pragma.app.infrastructure.driveadapter.persistence;


import com.pragma.app.infrastructure.driveadapter.entity.RestaurantEntity;

public interface IRestaurantPersistence {

    RestaurantEntity saveRestaurantPersistence(RestaurantEntity restaurantEntity);
}
