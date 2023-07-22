package com.shop.app.infrastructure.driveadapter.persistence;

import com.shop.app.domain.model.ShopModel;
import com.shop.app.domain.spi.IShopPersistencePort;
import com.shop.app.infrastructure.driveadapter.entity.ShopEntity;
import com.shop.app.infrastructure.driveadapter.mapper.IShopMapper;
import com.shop.app.infrastructure.driveadapter.repository.IShopRepository;

public class ShopPersistence implements IShopPersistencePort {

    private final IShopRepository shopRepository;
    private final IShopMapper shopMapper;

    public ShopPersistence(IShopRepository shopRepository, IShopMapper shopMapper) {
        this.shopRepository = shopRepository;
        this.shopMapper = shopMapper;
    }

    @Override
    public ShopModel saveShopPersistence(ShopModel shopModel) {
        ShopEntity shopEntity = shopMapper.mapToShopEntity(shopModel);
        ShopEntity savedEntity = shopRepository.save(shopEntity);
        return shopMapper.mapToShopModel(savedEntity);
    }
}