package com.pragma.app.application.dto.request;

import com.pragma.app.domain.model.RestaurantModel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateDishRequestDTO {

    private String name;
    private Integer price;
    private String description;
    private String urlImage;
    private String category;
    private RestaurantModel idRestaurant;

}