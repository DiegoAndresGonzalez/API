package com.shop.app.domain.usecase;

import com.shop.app.domain.api.IProductServicePort;
import com.shop.app.domain.exception.InvalidDataException;
import com.shop.app.domain.model.ProductModel;
import com.shop.app.domain.spi.IProductPersistencePort;


public class OwnerUseCase implements IProductServicePort {

    private final IProductPersistencePort productPersistence;

    public OwnerUseCase(IProductPersistencePort productPersistence) {
        this.productPersistence = productPersistence;
    }

    @Override
    public ProductModel saveProduct(ProductModel productModel) {

        if (productModel.getName() == null) {
            throw new InvalidDataException("Product's name can't be blank, please introduce a name.");
        }
        if (productModel.getIdShop() == null) {
            throw new InvalidDataException("Shop's name can't be blank, please introduce an existent shop ID.");
        }
        if (productModel.getPrice() == null || productModel.getPrice() <= 0) {
            throw new InvalidDataException("Product's price can't be blank, lower or same than 0");
        }
        if (productModel.getUrlImage() == null){
            throw new InvalidDataException("Product's portrait can't be blank, please add an image of it.");
        }
        if (productModel.getDescription() == null) {
            throw new InvalidDataException("Product's description can't be blank, please add a description.");
        }
        if (productModel.getCategory() == null) {
            throw new InvalidDataException("Product's category can't be blank, please introduce a category for the product.");
        }
        if (productModel == null){
            throw new InvalidDataException("Data is missing, please check again.");
        }
            else {
        productModel.setActive(true);
        return productPersistence.saveProductPersistence(productModel);
    }
  }
}