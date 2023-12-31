package com.shop.app.infrastructure.config;

import com.shop.app.domain.spi.IProductPersistencePort;
import com.shop.app.domain.usecase.OwnerUseCase;
import com.shop.app.infrastructure.driveadapter.mapper.IProductMapper;
import com.shop.app.infrastructure.driveadapter.persistence.ProductPersistence;
import com.shop.app.infrastructure.driveadapter.repository.IProductRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductConfig {

    private IProductRepository productRepository;
    private IProductMapper productMapper;
    private OwnerUseCase ownerUseCase;

    @Bean
    public IProductPersistencePort productPersistencePort(){
        return new ProductPersistence(productRepository,productMapper);
    }

    @Bean
    public OwnerUseCase ownerUseCase(IProductPersistencePort productPersistencePort){
        return new OwnerUseCase(productPersistencePort);
    }

}