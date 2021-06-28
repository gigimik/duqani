package com.duqnislomebi.duqani.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Table(indexes = {@Index(columnList = "sale_id")})
@Entity
@Setter
@Getter
public class FoodFacility {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nameGe;

    @Column
    private String nameEn;

    @Column
    private String location;

    @Column
    private String email;

    @ManyToOne(fetch = FetchType.LAZY)
    private Sale sale;

    @OneToMany(mappedBy = "dish")
    private Set<FacilityDishes> facilityDishes = new HashSet<>();

    @OneToMany(mappedBy = "drink")
    private Set<FacilityDrinks> facilityDrinks = new HashSet<>();

    @OneToMany(mappedBy = "dessert")
    private Set<FacilityDesserts> facilityDesserts = new HashSet<>();
}
