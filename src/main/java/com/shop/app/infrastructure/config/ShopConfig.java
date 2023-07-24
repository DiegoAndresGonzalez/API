package com.shop.app.infrastructure.config;

import com.shop.app.domain.spi.IShopPersistencePort;
import com.shop.app.infrastructure.driveadapter.mapper.IShopMapper;
import com.shop.app.infrastructure.driveadapter.persistence.ShopPersistence;
import com.shop.app.infrastructure.driveadapter.repository.IShopRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ShopConfig {

    private IShopRepository shopRepository;
    private IShopMapper shopMapper;

    @Bean
    public IShopPersistencePort shopPersistencePort(){
        return new ShopPersistence(shopRepository, shopMapper);
    }

