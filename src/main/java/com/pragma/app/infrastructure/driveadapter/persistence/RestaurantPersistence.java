package com.pragma.app.infrastructure.driveadapter.persistence;

import com.pragma.app.domain.model.RestaurantModel;
import com.pragma.app.domain.spi.IRestaurantPersistencePort;
import com.pragma.app.infrastructure.driveadapter.entity.RestaurantEntity;
import com.pragma.app.infrastructure.driveadapter.mapper.IRestaurantMapper;
import com.pragma.app.infrastructure.driveadapter.repository.IRestaurantRepository;

public class RestaurantPersistence implements IRestaurantPersistencePort {

    private final IRestaurantRepository restaurantRepository;
    private final IRestaurantMapper restaurantMapper;

    public RestaurantPersistence(IRestaurantRepository restaurantRepository, IRestaurantMapper restaurantMapper) {
        this.restaurantRepository = restaurantRepository;
        this.restaurantMapper = restaurantMapper;
    }

    @Override
    public RestaurantModel saveRestaurantPersistence(RestaurantModel restaurantModel) {
        RestaurantEntity restaurantEntity = restaurantMapper.mapToRestaurantEntity(restaurantModel);
        RestaurantEntity savedEntity = restaurantRepository.save(restaurantEntity);
        return restaurantMapper.mapToRestaurantModel(savedEntity);
    }
}
