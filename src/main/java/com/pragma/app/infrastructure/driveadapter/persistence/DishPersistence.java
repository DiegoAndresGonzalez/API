package com.pragma.app.infrastructure.driveadapter.persistence;

import com.pragma.app.domain.model.DishModel;
import com.pragma.app.domain.spi.IDishPersistencePort;
import com.pragma.app.infrastructure.driveadapter.entity.DishEntity;
import com.pragma.app.infrastructure.driveadapter.mapper.IDishMapper;
import com.pragma.app.infrastructure.driveadapter.repository.IDishRepository;

public class DishPersistence implements IDishPersistencePort {

    private final IDishRepository dishRepository;
    private final IDishMapper dishMapper;

    public DishPersistence(IDishRepository dishRepository, IDishMapper dishMapper) {
        this.dishRepository = dishRepository;
        this.dishMapper = dishMapper;
    }

    @Override
    public DishModel saveDishPersistence(DishModel dishModel){
        DishEntity dishEntity = dishMapper.mapToDishEntity(dishModel);
        DishEntity savedEntity = dishRepository.save(dishEntity);
        return dishMapper.mapToDishModel(savedEntity);
    }
}