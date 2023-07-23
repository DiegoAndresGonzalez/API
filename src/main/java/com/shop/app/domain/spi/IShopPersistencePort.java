package com.shop.app.domain.spi;

import com.shop.app.domain.model.ShopModel;

public interface IShopPersistencePort {
    ShopModel saveShopPersistence(ShopModel shopModel);
}
