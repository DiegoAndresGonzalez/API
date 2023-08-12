package com.shop.app.infrastructure.driveadapter.persistence;

import com.shop.app.domain.exception.InvalidDataException;
import com.shop.app.domain.model.ProductModel;
import com.shop.app.domain.spi.IProductPersistencePort;
import com.shop.app.infrastructure.driveadapter.entity.ProductEntity;
import com.shop.app.infrastructure.driveadapter.entity.ShopEntity;
import com.shop.app.infrastructure.driveadapter.mapper.IProductMapper;
import com.shop.app.infrastructure.driveadapter.repository.IProductRepository;
import com.shop.app.infrastructure.driveadapter.repository.IShopRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductPersistence implements IProductPersistencePort {

    @Autowired
    private final IProductRepository productRepository;

    @Autowired
    private final IProductMapper productMapper;

    @Autowired
    private final IShopRepository shopRepository;


    public ProductPersistence(IProductRepository productRepository, IProductMapper productMapper, IShopRepository shopRepository) {
        this.productRepository = productRepository;
        this.productMapper = productMapper;
        this.shopRepository = shopRepository;
    }

    @Override
    public ProductModel saveProductPersistence(ProductModel productModel){
        ProductEntity productEntity = productMapper.mapToProductEntity(productModel);
        Long idShop = productModel.getIdShop().getIdShop();
        Optional<ShopEntity> shopEntityOptional = shopRepository.findById(idShop);
        if (shopEntityOptional.isEmpty()){
            throw new InvalidDataException("Shop with ID " + idShop + " doesn't exist.");
        }else {
            ProductEntity savedEntity = productRepository.save(productEntity);
            return productMapper.mapToProductModel(savedEntity);
        }
    }
}