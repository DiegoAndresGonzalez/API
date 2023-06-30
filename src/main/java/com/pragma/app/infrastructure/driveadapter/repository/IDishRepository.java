package com.pragma.app.infrastructure.driveadapter.repository;

import com.pragma.app.infrastructure.driveadapter.entity.DishEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IDishRepository extends JpaRepository <DishEntity, Long> {
}