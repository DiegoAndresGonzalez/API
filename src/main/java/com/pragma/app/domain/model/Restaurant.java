package com.pragma.app.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;

@AllArgsConstructor
@Entity
@Data
@RequiredArgsConstructor
public class Restaurant{

    private String name;
    private String nit;
    private String address;
    private String cellPhoneRestaurant;
    private String urlLogo;
    private Long idOwner;


}