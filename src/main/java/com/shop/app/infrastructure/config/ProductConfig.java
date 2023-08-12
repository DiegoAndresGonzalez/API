package com.shop.app.infrastructure.config;

import com.shop.app.domain.spi.IProductPersistencePort;
import com.shop.app.domain.usecase.OwnerUseCase;
import com.shop.app.infrastructure.driveadapter.mapper.IProductMapper;
import com.shop.app.infrastructure.driveadapter.persistence.ProductPersistence;
import com.shop.app.infrastructure.driveadapter.repository.IProductRepository;
import com.shop.app.infrastructure.driveadapter.repository.IShopRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductConfig {

    private IProductRepository productRepository;
    private IProductMapper productMapper;
    private OwnerUseCase ownerUseCase;
    private IShopRepository shopRepository;

    @Bean
    public IProductPersistencePort productPersistencePort(){
        return new ProductPersistence(productRepository,productMapper,shopRepository);
    }

    @Bean
    public OwnerUseCase ownerUseCase(IProductPersistencePort productPersistencePort){
        return new OwnerUseCase(productPersistencePort);
    }

}