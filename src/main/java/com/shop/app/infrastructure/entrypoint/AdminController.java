package com.shop.app.infrastructure.entrypoint;

import com.shop.app.domain.model.ShopModel;
import com.shop.app.domain.spi.IShopPersistencePort;
import com.shop.app.infrastructure.driveadapter.entity.ShopEntity;
import com.shop.app.infrastructure.driveadapter.mapper.IShopMapper;
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
@RequestMapping("/shops")
public class AdminController {

    private final IShopPersistencePort shopPersistencePort;
    private final IShopMapper shopMapper;

    public AdminController(IShopPersistencePort shopPersistencePort, IShopMapper shopMapper) {
        this.shopPersistencePort = shopPersistencePort;
        this.shopMapper = shopMapper;
    }

    @PostMapping
    @Operation(summary = "Add a new Shop")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Shop created"),
            @ApiResponse(responseCode = "400", description = "The format in the fields is invalid"),
            @ApiResponse(responseCode = "403", description = "Role other than admin"),
            @ApiResponse(responseCode = "404", description = "No user found with that id"),
            @ApiResponse(responseCode = "409", description = "Conflict")
    })
    public ResponseEntity<String> saveShop(@RequestBody ShopEntity shopEntity){
        ShopModel shopModel = shopMapper.mapToShopModel(shopEntity);
        shopPersistencePort.saveShopPersistence(shopModel);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }


}