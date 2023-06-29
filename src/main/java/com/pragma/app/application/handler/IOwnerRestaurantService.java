package com.pragma.app.application.handler;

import com.pragma.app.application.dto.request.ModifyDescriptionPriceDishDTO;
import com.pragma.app.domain.usecase.DishModifyUseCase;

public interface IOwnerRestaurantService {
    ModifyDescriptionPriceDishDTO modifyDish (ModifyDescriptionPriceDishDTO request);
}
