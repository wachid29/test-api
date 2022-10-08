package com.domain.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.domain.entities.City;

@Repository
public interface CityRepository extends CrudRepository<City, Long> {

    City findByCityname(String cityname);

    void deleteById(long id);

}
