package com.springboot.myapp.springRest.controller;

import com.springboot.myapp.springRest.service.CarService;
import com.springboot.myapp.springRest.entity.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class CarController {

    private CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public List<Car> getAll(){
        return carService.getAll();
    }

    @GetMapping("cars/{id}")
    public Optional<Car> getCarById(@PathVariable int id){
        return carService.getOne(id);
    }

    @PostMapping("cars")
    public void save(@RequestBody Car car){
        carService.save(car);
    }



}
