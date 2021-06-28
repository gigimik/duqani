package com.duqnislomebi.duqani.domain.embeddable;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class FacilityDishId implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long facilityId;
    private Long dishId;

    public FacilityDishId() {
    }

    public FacilityDishId(Long facilityId, Long dishId) {
        super();
        this.facilityId = facilityId;
        this.dishId = dishId;
    }

    public Long getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(Long facilityId) {
        this.facilityId = facilityId;
    }

    public Long getDishId() {
        return dishId;
    }

    public void setDishId(Long dishId) {
        this.dishId = dishId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((facilityId == null) ? 0 : facilityId.hashCode());
        result = prime * result
                + ((dishId == null) ? 0 : dishId.hashCode());
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
        FacilityDishId other = (FacilityDishId) obj;
        return Objects.equals(getFacilityId(), other.getFacilityId()) && Objects.equals(getDishId(), other.getDishId());
    }
}
