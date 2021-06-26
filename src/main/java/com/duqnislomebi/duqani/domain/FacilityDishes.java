package com.duqnislomebi.duqani.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "facility_dishes")
@Setter
@Getter
public class FacilityDishes {

    @Column
    private Integer price;
}
