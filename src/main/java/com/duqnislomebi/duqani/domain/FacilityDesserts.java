package com.duqnislomebi.duqani.domain;

import com.duqnislomebi.duqani.domain.embeddable.FacilityDessertId;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "facility_desserts")
@Setter
@Getter
public class FacilityDesserts {

    @EmbeddedId
    private FacilityDessertId id = new FacilityDessertId();

    @ManyToOne
    @MapsId("dessertId")
    private Dessert dessert;

    @Column
    private Integer price;
}
