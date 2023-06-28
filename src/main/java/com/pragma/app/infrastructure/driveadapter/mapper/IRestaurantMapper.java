package com.pragma.app.infrastructure.driveadapter.mapper;

import com.pragma.app.domain.model.RestaurantModel;
import com.pragma.app.infrastructure.driveadapter.entity.RestaurantEntity;
import org.mapstruct.Mapper;

@Mapper
public interface IRestaurantMapper {
    RestaurantModel mapToRestaurantModel(RestaurantEntity restaurantEntity);
    RestaurantEntity mapToRestaurantEntity(RestaurantModel restaurantModel);
}
