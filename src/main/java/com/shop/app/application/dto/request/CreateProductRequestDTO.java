package com.shop.app.application.dto.request;

import com.shop.app.domain.model.ShopModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class CreateProductRequestDTO {
    private String name;
    private Integer price;
    private String description;
    private String urlImage;
    private String category;
    private Long idShop;

}

