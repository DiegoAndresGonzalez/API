package com.pragma.app.domain.api;

import com.pragma.app.domain.model.Restaurant;
import com.pragma.app.domain.spi.external.RestaurantRepository;
import com.pragma.app.domain.usecase.CreatRestaurantUseCase;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {

    private final CreatRestaurantUseCase creatRestaurantUseCase;
    private final RestaurantRepository restaurantRepository;

    public RestaurantController(CreatRestaurantUseCase creatRestaurantUseCase, RestaurantRepository restaurantRepository) {
        this.creatRestaurantUseCase = creatRestaurantUseCase;
        this.restaurantRepository = restaurantRepository;
    }

    @PostMapping
    public ResponseEntity<> creatRestaurant(@RequestBody Restaurant restaurant){

        if( restaurant.getName() == null ||
            restaurant.getNit() == null ||
            restaurant.getAddress() == null ||
            restaurant.getCellPhoneRestaurant() == null ||
            restaurant.getUrlLogo() == null ||
            restaurant.getIdOwner() == 0){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("mandatory fields are missing");
        }
    }
}
