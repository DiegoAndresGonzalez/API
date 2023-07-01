package com.pragma.app.infrastructure.driveadapter.repository;

import com.pragma.app.infrastructure.driveadapter.entity.RestaurantEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRestaurantRepository extends JpaRepository<RestaurantEntity, Long> {
}
