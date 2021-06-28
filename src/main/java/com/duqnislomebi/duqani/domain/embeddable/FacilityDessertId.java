package com.duqnislomebi.duqani.domain.embeddable;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class FacilityDessertId implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long facilityId;
    private Long dessertId;

    public FacilityDessertId() {
    }

    public FacilityDessertId(Long facilityId, Long dessertId) {
        super();
        this.facilityId = facilityId;
        this.dessertId = dessertId;
    }

    public Long getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(Long facilityId) {
        this.facilityId = facilityId;
    }

    public Long getDessertId() {
        return dessertId;
    }

    public void setDessertId(Long dessertId) {
        this.dessertId = dessertId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result
                + ((facilityId == null) ? 0 : facilityId.hashCode());
        result = prime * result
                + ((dessertId == null) ? 0 : dessertId.hashCode());
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
        FacilityDessertId other = (FacilityDessertId) obj;
        return Objects.equals(getFacilityId(), other.getFacilityId()) && Objects.equals(getDessertId(), other.getDessertId());
    }
}
