package com.pragma.app.infrastructure.entrypoint;

import com.pragma.app.domain.model.DishModel;
import com.pragma.app.domain.spi.IDishPersistencePort;
import com.pragma.app.infrastructure.driveadapter.entity.DishEntity;
import com.pragma.app.infrastructure.driveadapter.mapper.IDishMapper;
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
@RequestMapping("/dishes")
public class OwnerController {

    private final IDishPersistencePort dishPersistencePort;
    private final IDishMapper dishMapper;

    public OwnerController(IDishPersistencePort dishPersistencePort, IDishMapper dishMapper) {
        this.dishPersistencePort = dishPersistencePort;
        this.dishMapper = dishMapper;
    }

    @PostMapping
    @Operation(summary = "Add a new dish")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "A new dish has been created."),
            @ApiResponse(responseCode = "400", description = "You introduced an incorrect entry, please, try again."),
            @ApiResponse(responseCode = "403", description = "You are trying to create a dish from an account different than owner."),
            @ApiResponse(responseCode = "404", description = "No user has been found with that ID, please verify and try again."),
            @ApiResponse(responseCode = "409", description = "A conflict has occurred, please, try again.")
    })

    public ResponseEntity<String> saveDish(@RequestBody DishEntity dishEntity){
        DishModel dishModel = dishMapper.mapToDishModel(dishEntity);
        dishPersistencePort.saveDishPersistence(dishModel);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}