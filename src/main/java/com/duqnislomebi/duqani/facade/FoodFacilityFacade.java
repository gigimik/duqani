package com.duqnislomebi.duqani.facade;

import com.duqnislomebi.duqani.domain.FoodFacility;
import com.duqnislomebi.duqani.model.SearchRequest;
import com.duqnislomebi.duqani.service.FoodFacilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;

@Component
public class FoodFacilityFacade {

    private final FoodFacilityService service;

    @Autowired
    public FoodFacilityFacade(FoodFacilityService service) {
        this.service = service;
    }

    public Page<FoodFacility> getFoodFacilities(SearchRequest searchRequest) {
        PageRequest pageRequest = PageRequest.of(searchRequest.getPage() - 1, searchRequest.getLimit());
        Page<FoodFacility> facilities = service.getFacilities(pageRequest);

        return facilities;
    }
}
