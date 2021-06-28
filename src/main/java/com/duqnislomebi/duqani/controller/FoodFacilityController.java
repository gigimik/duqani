package com.duqnislomebi.duqani.controller;

import com.duqnislomebi.duqani.domain.FoodFacility;
import com.duqnislomebi.duqani.facade.FoodFacilityFacade;
import com.duqnislomebi.duqani.model.SearchRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/facilities")
public class FoodFacilityController {

    private final FoodFacilityFacade foodFacilityFacade;

    @Autowired
    public FoodFacilityController(FoodFacilityFacade facade) {
        this.foodFacilityFacade = facade;
    }

    @GetMapping("getFacilities")
    public Page<FoodFacility> getFoodFacilities(SearchRequest searchRequest) {
        return foodFacilityFacade.getFoodFacilities(searchRequest);
    }
}
