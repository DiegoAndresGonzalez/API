package com.pragma.app.domain.model;

public class DishModel {

    private Long id;
    private String name;
    private Integer price;
    private String description;
    private String urlImage;
    private String category;
    private Long idRestaurant;
    private boolean active;

    public DishModel(Long id, String name, Integer price, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public DishModel(String urlImage, String category, Long idRestaurant, boolean active) {
        this.urlImage = urlImage;
        this.category = category;
        this.idRestaurant = idRestaurant;
        this.active = active;
    }

    public DishModel() {
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

    public Long getIdRestaurant() {
        return idRestaurant;
    }

    public void setIdRestaurant(Long idRestaurant) {
        this.idRestaurant = idRestaurant;
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
}