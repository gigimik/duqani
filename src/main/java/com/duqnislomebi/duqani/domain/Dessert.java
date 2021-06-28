package com.duqnislomebi.duqani.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "dessert")
@Setter
@Getter
public class Dessert {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nameGe;

    @Column
    private String nameEn;

    @Column
    private Boolean isVegan;
}
