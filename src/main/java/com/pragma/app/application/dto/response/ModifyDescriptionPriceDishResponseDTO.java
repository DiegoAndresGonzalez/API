package com.pragma.app.application.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor

public class ModifyDescriptionPriceDishResponseDTO {
    private Long id;
    private Integer price;
    private String description;

}
