package com.shop.app.domain.usecase;

import com.shop.app.domain.api.IShopServicePort;
import com.shop.app.domain.exception.InvalidDataException;
import com.shop.app.domain.model.ShopModel;
import com.shop.app.domain.spi.IShopPersistencePort;

public class AdminUseCase implements IShopServicePort {

    private final IShopPersistencePort shopPersistence;

    public AdminUseCase(IShopPersistencePort shopPersistence) {
        this.shopPersistence = shopPersistence;
    }

    @Override
    public ShopModel saveShop(ShopModel shopModel) {

        validateIfCellPhoneShopIsValid(shopModel.getCellPhoneShop());

        if(!shopModel.getNit().matches("\\d+")) {
            throw new InvalidDataException("The NIT must contain only numeric");
        }

        shopPersistence.saveShopPersistence(shopModel);
        return shopModel;
    }
    private void validateIfCellPhoneShopIsValid(String cellPhoneRestaurant) {
        if(!cellPhoneRestaurant.matches("[+\\d]+")) {
            throw new InvalidDataException("The cell phone field must contain only numbers and the '+' symbol");
        }

        if(cellPhoneRestaurant.length() > 13){
            throw new InvalidDataException("The cell phone field must have a maximum of 13 digits");
        }
    }
}