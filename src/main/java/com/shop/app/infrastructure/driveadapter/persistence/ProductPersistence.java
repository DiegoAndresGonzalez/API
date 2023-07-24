package com.shop.app.infrastructure.driveadapter.persistence;

import com.shop.app.domain.model.ProductModel;
import com.shop.app.domain.spi.IProductPersistencePort;
import com.shop.app.infrastructure.driveadapter.entity.ProductEntity;
import com.shop.app.infrastructure.driveadapter.mapper.IProductMapper;
import com.shop.app.infrastructure.driveadapter.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductPersistence implements IProductPersistencePort {

    @Autowired
    private final IProductRepository productRepository;
    @Autowired
    private final IProductMapper productMapper;

    public ProductPersistence(IProductRepository productRepository, IProductMapper productMapper) {
        this.productRepository = productRepository;
        this.productMapper = productMapper;
    }

    @Override
    public ProductModel saveProductPersistence(ProductModel productModel){
        ProductEntity productEntity = productMapper.mapToProductEntity(productModel);
        ProductEntity savedEntity = productRepository.save(productEntity);
        return productMapper.mapToProductModel(savedEntity);
    }
}