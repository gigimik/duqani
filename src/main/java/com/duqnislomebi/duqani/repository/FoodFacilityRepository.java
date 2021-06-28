package com.duqnislomebi.duqani.repository;

import com.duqnislomebi.duqani.domain.FoodFacility;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodFacilityRepository extends CrudRepository<FoodFacility, Long> {

}
