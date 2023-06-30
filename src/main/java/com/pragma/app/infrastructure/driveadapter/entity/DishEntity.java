package com.pragma.app.infrastructure.driveadapter.entity;

import com.pragma.app.domain.model.RestaurantModel;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "dish")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DishEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Integer price;
    private String description;
    private String urlImage;
    private String category;

    @ManyToOne
    @JoinColumn(name = "idRestaurant")
    private RestaurantModel idRestaurant;
    private boolean active;

}