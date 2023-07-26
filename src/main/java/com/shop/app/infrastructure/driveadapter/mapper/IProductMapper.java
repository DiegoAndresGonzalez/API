package com.shop.app.infrastructure.driveadapter.mapper;

import com.shop.app.application.dto.request.CreateProductRequestDTO;
import com.shop.app.application.dto.request.DeleteProductRequestDTO;
import com.shop.app.application.dto.response.CreateProductResponseDTO;
import com.shop.app.domain.model.ProductModel;
import com.shop.app.domain.model.ShopModel;
import com.shop.app.infrastructure.driveadapter.entity.ProductEntity;
import org.mapstruct.Mapper;


@Mapper
public interface IProductMapper {


    ProductModel mapToProductModel(ProductEntity productEntity);

    ProductEntity mapToProductEntity(ProductModel productModel);

    ProductModel mapToProductDTO(CreateProductRequestDTO createProductRequestDTO);

    ShopModel mapToShopID(Long idShop);

    CreateProductResponseDTO mapToResponseDTO(ProductModel productModel);

    ProductModel mapToDeleteDTO(DeleteProductRequestDTO deleteProductRequestDTO);

}
