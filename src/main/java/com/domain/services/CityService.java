package com.domain.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.domain.entities.City;
import com.domain.repos.CityRepository;

@Service
public class CityService {

    @Autowired
    CityRepository cityresRepository;

    public CityService() {

    }

    public Iterable<City> getCities() {
        return cityresRepository.findAll();

    }

    public City saveCity(City city) {
        return cityresRepository.save(city);
    }

    public City getCity(String cityname) {
        return cityresRepository.findByCityname(cityname);
    }

    public void deleteCity(Long id) {
        cityresRepository.deleteById(id);
    }

}
