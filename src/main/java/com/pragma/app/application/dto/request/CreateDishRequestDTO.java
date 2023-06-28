package com.pragma.app.application.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateDishRequestDTO {

    private String name;
    private Integer price;
    private String description;
    private String urlImage;
    private String category;
    private Long idRestaurant;

}