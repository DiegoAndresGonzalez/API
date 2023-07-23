package com.shop.app.domain.api;

import com.shop.app.domain.model.ProductModel;

public interface IProductServicePort {
    ProductModel saveProduct(ProductModel productModel);
}