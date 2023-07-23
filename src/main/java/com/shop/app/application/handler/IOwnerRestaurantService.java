package com.shop.app.application.handler;

import com.shop.app.application.dto.request.CreateProductRequestDTO;

public interface IOwnerRestaurantService {
    void createProduct(CreateProductRequestDTO request);
}