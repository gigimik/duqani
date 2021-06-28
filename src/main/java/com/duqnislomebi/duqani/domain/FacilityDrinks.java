package com.duqnislomebi.duqani.domain;

import com.duqnislomebi.duqani.domain.embeddable.FacilityDrinkId;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "facility_drinks")
@Setter
@Getter
public class FacilityDrinks {

    @EmbeddedId
    private FacilityDrinkId id = new FacilityDrinkId();

    @ManyToOne
    @MapsId("drinkId")
    private Drink drink;

    @Column
    private Integer price;
}
