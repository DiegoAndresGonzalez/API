package com.shop.app.domain.spi;

import com.shop.app.domain.model.ProductModel;
import com.shop.app.domain.model.ShopModel;

public interface IProductPersistencePort {
    ProductModel saveProductPersistence(ProductModel productModel);
    ShopModel findShopById(Long idShop);
}