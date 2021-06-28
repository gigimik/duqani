package com.duqnislomebi.duqani.service;

import com.duqnislomebi.duqani.domain.FoodFacility;
import com.duqnislomebi.duqani.repository.FoodFacilityRepository;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodFacilityService {

    private final FoodFacilityRepository repository;

    @Autowired
    public FoodFacilityService(FoodFacilityRepository repository) {
        this.repository = repository;
    }

    public Page<FoodFacility> getFacilities(Pageable pageable) {
        List<FoodFacility> facilities = Lists.newArrayList(repository.findAll());

        return new PageImpl<>(facilities, pageable, facilities.size());
    }
}
