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
    private ShopModel idShop;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public ShopModel getIdShop() {
        return idShop;
    }

    public void setIdShop(ShopModel idShop) {
        this.idShop = idShop;
    }

}