package com.duqnislomebi.duqani.domain.embeddable;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class FacilityDrinkId implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long facilityId;
    private Long drinkId;

    public FacilityDrinkId() {
    }

    public FacilityDrinkId(Long facilityId, Long drinkId) {
        super();
        this.facilityId = facilityId;
        this.drinkId = drinkId;
    }

    public Long getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(Long facilityId) {
        this.facilityId = facilityId;
    }

    public Long getDrinkId() {
        return drinkId;
    }

    public void setDrinkId(Long drinkId) {
        this.drinkId = drinkId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((facilityId == null) ? 0 : facilityId.hashCode());
        result = prime * result
                + ((drinkId == null) ? 0 : drinkId.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        FacilityDrinkId other = (FacilityDrinkId) obj;
        return Objects.equals(getFacilityId(), other.getFacilityId()) && Objects.equals(getDrinkId(), other.getDrinkId());
    }
}
