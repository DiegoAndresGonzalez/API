package com.shop.app.infrastructure.driveadapter.mapper;

import com.shop.app.domain.model.ShopModel;
import com.shop.app.infrastructure.driveadapter.entity.ShopEntity;
import org.mapstruct.Mapper;

@Mapper
public interface IShopMapper {
    ShopModel mapToShopModel(ShopEntity shopEntity);
    ShopEntity mapToShopEntity(ShopModel shopModel);

}
