package com.pragma.app.application.dto.response;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CreateDishResponseDTO {

    private Long id;
    private String name;
    private Integer price;
    private String description;
    private String urlImage;
    private String category;
    private Long idRestaurant;
    private boolean active;

}