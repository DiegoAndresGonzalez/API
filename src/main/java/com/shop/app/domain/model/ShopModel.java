package com.shop.app.domain.model;

public class ShopModel {

    private Long idShop;
    private String name;
    private String nit;
    private String address;
    private String cellPhoneShop;
    private String urlLogo;
    private Long idOwner;

    public ShopModel() {
    }

    public ShopModel(Long idShop, String name, String nit, String address, String cellPhoneShop, String urlLogo, Long idOwner) {
        this.idShop = idShop;
        this.name = name;
        this.nit = nit;
        this.address = address;
        this.cellPhoneShop = cellPhoneShop;
        this.urlLogo = urlLogo;
        this.idOwner = idOwner;
    }

    public Long getIdShop() {
        return idShop;
    }

    public void setIdShop(Long idShop) {
        this.idShop = idShop;
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

    public String getCellPhoneShop() {
        return cellPhoneShop;
    }

    public void setCellPhoneShop(String cellPhoneShop) {
        this.cellPhoneShop = cellPhoneShop;
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