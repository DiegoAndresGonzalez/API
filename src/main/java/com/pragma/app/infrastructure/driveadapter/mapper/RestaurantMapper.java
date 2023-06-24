package com.pragma.app.infrastructure.driveadapter.mapper;

import com.pragma.app.domain.model.RestaurantModel;
import com.pragma.app.infrastructure.driveadapter.entity.RestaurantEntity;

public class RestaurantMapper {

    public static RestaurantModel mapToRestaurantModel(RestaurantEntity restaurantEntity) {
        RestaurantModel restaurantModel = new RestaurantModel();
        restaurantModel.setIdRestaurant(restaurantEntity.getIdRestaurant());
        restaurantModel.setName(restaurantEntity.getName());
        restaurantModel.setNit(restaurantEntity.getNit());
        restaurantModel.setAddress(restaurantEntity.getCellPhoneRestaurant());
        restaurantModel.setUrlLogo(restaurantEntity.getUrlLogo());
        restaurantModel.setIdOwner(restaurantEntity.getIdOwner());
        return restaurantModel;
    }

    public static RestaurantEntity mapToRestaurantEntity(RestaurantModel restaurantModel){
        RestaurantEntity restaurantEntity = new RestaurantEntity();
        restaurantEntity.setIdRestaurant(restaurantModel.getIdRestaurant());
        restaurantEntity.setName(restaurantModel.getName());
        restaurantEntity.setNit(restaurantModel.getNit());
        restaurantEntity.setAddress(restaurantModel.getAddress());
        restaurantEntity.setCellPhoneRestaurant(restaurantModel.getCellPhoneRestaurant());
        restaurantEntity.setUrlLogo(restaurantModel.getUrlLogo());
        restaurantEntity.setIdOwner(restaurantModel.getIdOwner());
        return restaurantEntity;
    }
}
