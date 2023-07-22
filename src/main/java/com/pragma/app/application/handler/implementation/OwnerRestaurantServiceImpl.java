package com.pragma.app.application.handler.implementation;

import com.pragma.app.application.dto.request.CreateDishRequestDTO;
import com.pragma.app.application.dto.response.CreateDishResponseDTO;
import com.pragma.app.application.handler.IOwnerRestaurant;

public class OwnerRestaurantServiceImpl implements IOwnerRestaurant {

    @Override
    public CreateDishResponseDTO createDish(CreateDishResponseDTODTO request) {
        String name = request.getName();
        Integer price = request.getPrice();
        String description = request.getDescription();
        return request;
    }
}
