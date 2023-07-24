package com.shop.app.infrastructure.driveadapter.repository;

import com.shop.app.infrastructure.driveadapter.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductRepository extends JpaRepository <ProductEntity, Long> {
}