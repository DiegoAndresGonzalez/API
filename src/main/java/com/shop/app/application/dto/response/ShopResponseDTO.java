package com.shop.app.application.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ShopResponseDTO {

    private Long idShop;
    private String name;
    private String nit;
    private String address;
    private String cellPhoneShop;
    private String urlLogo;
    private Long idOwner;
}
