package com.pragma.app.infrastructure.config;

import com.pragma.app.domain.spi.IRestaurantPersistencePort;
import com.pragma.app.infrastructure.driveadapter.mapper.IRestaurantMapper;
import com.pragma.app.infrastructure.driveadapter.persistence.RestaurantPersistence;
import com.pragma.app.infrastructure.driveadapter.repository.IRestaurantRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
    private  IRestaurantRepository restaurantRepository;
    private  IRestaurantMapper restaurantMapper;
    
    @Bean
    public IRestaurantPersistencePort restarurantPersistence(){
        return new RestaurantPersistence(restaurantRepository, restaurantMapper );
    }
}
