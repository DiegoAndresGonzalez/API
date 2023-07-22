package com.shop.app.domain.api;

import com.shop.app.domain.model.ShopModel;

public interface IShopServicePort {
    ShopModel saveShop(ShopModel shopModel);
}
