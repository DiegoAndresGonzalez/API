package com.pragma.app.application.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class RestaurantResponseDTO {

    private Long idRestaurant;
    private String name;
    private String nit;
    private String address;
    private String cellPhoneRestaurant;
    private String urlLogo;
    private Long idOwner;
}
