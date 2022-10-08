package com.domain.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.domain.entities.City;
import com.domain.services.CityService;

@RestController
public class testcontroller {

    @Autowired
    CityService cityService;

    @GetMapping("test")
    public String test() {
        return "Test 123";
    }

    @GetMapping("getcities")
    public Iterable<City> getCities() {
        return cityService.getCities();

    }

    @PostMapping("addcity")
    public City saveCity(@RequestBody City city) {
        return cityService.saveCity(city);

    }

    @GetMapping("getcity")
    public City getCity(String cityname) {
        return cityService.getCity(cityname);
    }

    @DeleteMapping("deletecity/{id}")
    public void deleteCity(@PathVariable("id") Long id) {
        cityService.deleteCity(id);
    }

}
