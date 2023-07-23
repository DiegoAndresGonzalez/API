package com.shop.app.infrastructure.driveadapter.repository;

import com.shop.app.infrastructure.driveadapter.entity.ShopEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IShopRepository extends JpaRepository<ShopEntity, Long> {
}
