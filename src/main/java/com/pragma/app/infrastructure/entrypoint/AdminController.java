package com.pragma.app.infrastructure.entrypoint;

import com.pragma.app.domain.model.RestaurantModel;
import com.pragma.app.domain.spi.IRestaurantPersistencePort;
import com.pragma.app.infrastructure.driveadapter.entity.RestaurantEntity;
import com.pragma.app.infrastructure.driveadapter.mapper.IRestaurantMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/restaurants")
public class AdminController {

    private final IRestaurantPersistencePort restaurantPersistencePort;
    private final IRestaurantMapper restaurantMapper;

    public AdminController(IRestaurantPersistencePort restaurantPersistencePort, IRestaurantMapper restaurantMapper) {
        this.restaurantPersistencePort = restaurantPersistencePort;
        this.restaurantMapper = restaurantMapper;
    }

    @PostMapping
    public ResponseEntity<Void> saveRestaurant(@RequestBody RestaurantEntity restaurantEntity){
        RestaurantModel restaurantModel = restaurantMapper.mapToRestaurantModel(restaurantEntity);
        restaurantPersistencePort.saveRestaurantPersistence(restaurantModel);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
