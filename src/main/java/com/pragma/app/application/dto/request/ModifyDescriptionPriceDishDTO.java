package com.pragma.app.application.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class ModifyDescriptionPriceDishDTO {
    private Long id;
    private String description;
    private Integer price;


}
