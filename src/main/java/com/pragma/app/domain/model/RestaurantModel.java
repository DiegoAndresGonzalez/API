package com.pragma.app.domain.model;

public class RestaurantModel {

    private Long idRestaurant;
    private String name;
    private String nit;
    private String address;
    private String cellPhoneRestaurant;
    private String urlLogo;
    private Long idOwner;

    public RestaurantModel() {
    }

    public RestaurantModel(Long idRestaurant, String name, String nit, String address, String cellPhoneRestaurant, String urlLogo, Long idOwner) {
        this.idRestaurant = idRestaurant;
        this.name = name;
        this.nit = nit;
        this.address = address;
        this.cellPhoneRestaurant = cellPhoneRestaurant;
        this.urlLogo = urlLogo;
        this.idOwner = idOwner;
    }

    public Long getIdRestaurant() {
        return idRestaurant;
    }

    public void setIdRestaurant(Long idRestaurant) {
        this.idRestaurant = idRestaurant;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCellPhoneRestaurant() {
        return cellPhoneRestaurant;
    }

    public void setCellPhoneRestaurant(String cellPhoneRestaurant) {
        this.cellPhoneRestaurant = cellPhoneRestaurant;
    }

    public String getUrlLogo() {
        return urlLogo;
    }

    public void setUrlLogo(String urlLogo) {
        this.urlLogo = urlLogo;
    }

    public Long getIdOwner() {
        return idOwner;
    }

    public void setIdOwner(Long idOwner) {
        this.idOwner = idOwner;
    }
}