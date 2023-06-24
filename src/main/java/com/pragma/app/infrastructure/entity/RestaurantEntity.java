package com.pragma.app.infrastructure.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

public class RestaurantEntity {

    @Entity
    @Data
    public class RestaurantModel {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long idRestaurant;
        private String name;
        private String nit;
        private String address;
        private String cellPhoneRestaurant;
        private String urlLogo;
        private Long idOwner;
    }
}
