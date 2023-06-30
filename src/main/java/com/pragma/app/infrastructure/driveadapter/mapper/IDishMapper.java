package com.pragma.app.infrastructure.driveadapter.mapper;

import com.pragma.app.domain.model.DishModel;
import com.pragma.app.infrastructure.driveadapter.entity.DishEntity;
import org.mapstruct.Mapper;

@Mapper
public interface IDishMapper {

    DishModel mapToDishModel(DishEntity dishentity);
    DishEntity mapToDishEntity(DishModel dishModel);

}
