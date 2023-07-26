package com.shop.app.domain.spi;

import com.shop.app.domain.model.ProductModel;

public interface IProductPersistencePort {
    ProductModel saveProductPersistence(ProductModel productModel);

    ProductModel deleteProductPersistence(ProductModel productModel);

}