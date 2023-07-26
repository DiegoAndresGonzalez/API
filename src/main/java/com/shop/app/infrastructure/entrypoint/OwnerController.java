package com.shop.app.infrastructure.entrypoint;

import com.shop.app.application.dto.request.CreateProductRequestDTO;
import com.shop.app.application.dto.request.DeleteProductRequestDTO;
import com.shop.app.application.dto.response.CreateProductResponseDTO;
import com.shop.app.domain.model.ProductModel;
import com.shop.app.domain.model.ShopModel;
import com.shop.app.domain.spi.IProductPersistencePort;
import com.shop.app.domain.usecase.OwnerUseCase;
import com.shop.app.infrastructure.driveadapter.mapper.IProductMapper;
import com.shop.app.infrastructure.driveadapter.persistence.ProductPersistence;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class OwnerController {

    @Autowired
    private final IProductPersistencePort productPersistencePort;

    @Autowired
    private final IProductMapper productMapper;

    @Autowired
    private final OwnerUseCase ownerUseCase;

    public OwnerController(IProductPersistencePort productPersistencePort, IProductMapper productMapper,OwnerUseCase ownerUseCase) {
        this.productPersistencePort = productPersistencePort;
        this.productMapper = productMapper;
        this.ownerUseCase = ownerUseCase;
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

    public ResponseEntity<CreateProductResponseDTO> saveProduct(@RequestBody CreateProductRequestDTO productRequestDTO){
        ShopModel shopModel = productMapper.mapToShopID(productRequestDTO.getIdShop());
        ProductModel productModel = productMapper.mapToProductDTO(productRequestDTO);
        productModel.setIdShop(shopModel);
        ProductModel savedProduct = ownerUseCase.saveProduct(productModel);
        CreateProductResponseDTO productResponseDTO = productMapper.mapToResponseDTO(savedProduct);
        return ResponseEntity.status(HttpStatus.CREATED).body(productResponseDTO);
    }


    @DeleteMapping("/delete")
    public ResponseEntity<Void> deleteProduct(@RequestBody DeleteProductRequestDTO deleteProductRequestDTO){
        ProductModel productModel = productMapper.mapToDeleteDTO(deleteProductRequestDTO);
        productPersistencePort.deleteProductPersistence(productModel);
        return ResponseEntity.noContent().build();

    }

}