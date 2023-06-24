package com.pragma.app.infrastructure.entrypoint;

import com.pragma.app.infrastructure.driveadapter.entity.RestaurantEntity;
import com.pragma.app.infrastructure.driveadapter.persistence.IRestaurantPersistence;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/restaurants")
public class RestaurantController {

    private final IRestaurantPersistence restaurantPersistence;

    public RestaurantController(IRestaurantPersistence restaurantPersistence) {
        this.restaurantPersistence = restaurantPersistence;
    }

    @PostMapping
    public ResponseEntity<Void> saveNewRestaurant(@RequestBody RestaurantEntity restaurantEntity){
        restaurantPersistence.saveRestaurantPersistence(restaurantEntity);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
