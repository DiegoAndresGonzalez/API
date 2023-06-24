package com.pragma.app.infrastructure.driveadapter.persistence;


import com.pragma.app.infrastructure.driveadapter.entity.RestaurantEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRestaurantPersistence {

    RestaurantEntity saveRestaurantPersistence(RestaurantEntity restaurantEntity);
}
