package com.pragma.app.infrastructure.entrypoint;

import com.pragma.app.domain.model.RestaurantModel;
import com.pragma.app.domain.spi.IRestaurantPersistencePort;
import com.pragma.app.infrastructure.driveadapter.entity.RestaurantEntity;
import com.pragma.app.infrastructure.driveadapter.mapper.IRestaurantMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
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
    @Operation(summary = "Add a new Restaurant")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Restaurant created"),
            @ApiResponse(responseCode = "400", description = "The format in the fields is invalid"),
            @ApiResponse(responseCode = "403", description = "Role other than admin"),
            @ApiResponse(responseCode = "404", description = "No user found with that id"),
            @ApiResponse(responseCode = "409", description = "Conflict")
    })
    public ResponseEntity<String> saveRestaurant(@RequestBody RestaurantEntity restaurantEntity){
        RestaurantModel restaurantModel = restaurantMapper.mapToRestaurantModel(restaurantEntity);
        restaurantPersistencePort.saveRestaurantPersistence(restaurantModel);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
