package com.shop.app.domain.model;

public class ProductModel {

    private Long id;
    private String name;
    private Integer price;
    private String description;
    private String urlImage;
    private String category;
    private ShopModel idShop;
    private boolean active;

    public ProductModel(Long id, String name, Integer price, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public ProductModel(String urlImage, String category, ShopModel idShop, boolean active) {
        this.urlImage = urlImage;
        this.category = category;
        this.idShop = idShop;
        this.active = active;
    }

    public ProductModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public ShopModel getIdShop() {
        return idShop;
    }

    public void setIdShop(ShopModel idShop) {
        this.idShop = idShop;
    }

}