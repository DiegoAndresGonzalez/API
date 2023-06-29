package com.pragma.app.infrastructure.driveadapter.entity;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "restaurant")
@Entity
public class RestaurantEntity {

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
