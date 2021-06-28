package com.duqnislomebi.duqani.domain;

import com.duqnislomebi.duqani.domain.embeddable.FacilityDishId;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "facility_dishes")
@Setter
@Getter
public class FacilityDishes {

    @EmbeddedId
    private FacilityDishId id = new FacilityDishId();

    @ManyToOne
    @MapsId("dishId")
    private Dish dish;

    @Column
    private Integer price;
}
