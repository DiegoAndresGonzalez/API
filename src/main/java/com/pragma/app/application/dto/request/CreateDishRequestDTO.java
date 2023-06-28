package com.pragma.app.application.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class CreateDishRequestDTO {

    private String name;
    private Integer price;
    private String description;
    private String urlImage;
    private String category;
    private Long idRestaurant;

}