package com.pragma.app.application.handler;

import com.pragma.app.application.dto.request.CreateDishRequestDTO;
import com.pragma.app.application.dto.response.CreateDishResponseDTO;

public interface IOwnerRestaurant {
    CreateDishRequestDTO createDish(CreateDishRequestDTO request);
}
