package com.shop.app.infrastructure.entrypoint;

import com.shop.app.application.dto.request.CreateProductRequestDTO;
import com.shop.app.domain.model.ProductModel;
import com.shop.app.domain.model.ShopModel;
import com.shop.app.domain.spi.IProductPersistencePort;
import com.shop.app.infrastructure.driveadapter.mapper.IProductMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class OwnerController {

    @Autowired
    private final IProductPersistencePort productPersistencePort;
    @Autowired
    private final IProductMapper productMapper;


    public OwnerController(IProductPersistencePort productPersistencePort, IProductMapper productMapper) {
        this.productPersistencePort = productPersistencePort;
        this.productMapper = productMapper;
    }

    @PostMapping
    @Operation(summary = "Add a new product")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "A new product has been created."),
            @ApiResponse(responseCode = "400", description = "You introduced an incorrect entry, please, try again."),
            @ApiResponse(responseCode = "403", description = "You are trying to create a product from an account different than owner."),
            @ApiResponse(responseCode = "404", description = "No user has been found with that ID, please verify and try again."),
            @ApiResponse(responseCode = "409", description = "A conflict has occurred, please, try again.")
    })

    public ResponseEntity<String> saveProduct(@RequestBody CreateProductRequestDTO productRequestDTO){
        ShopModel shopModel = productMapper.mapToShopID(productRequestDTO.getIdShop());
        ProductModel productModel = productMapper.mapToProductDTO(productRequestDTO);
        productModel.setIdShop(shopModel);
        productPersistencePort.saveProductPersistence(productModel);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}