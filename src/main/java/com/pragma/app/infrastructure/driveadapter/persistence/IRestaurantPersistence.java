package com.pragma.app.infrastructure.driveadapter.persistence;

import com.pragma.app.domain.model.RestaurantModel;
import com.pragma.app.infrastructure.driveadapter.entity.RestaurantEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRestaurantPersistence extends JpaRepository<RestaurantEntity, Long> {

    RestaurantModel saveRestaurantPersistence(RestaurantModel restaurantModel);
}
