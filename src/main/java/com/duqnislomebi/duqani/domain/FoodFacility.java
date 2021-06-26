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

    @ManyToMany(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JoinTable(
            name = "facility_dishes",
            joinColumns = {@JoinColumn(name = "FACILITY_ID")},
            inverseJoinColumns = {@JoinColumn(name = "DISH_ID")}
    )
    private Set<Dish> dishes = new HashSet<>();
}
