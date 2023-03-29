package com.springboot.myapp.springRest.controller;

import com.springboot.myapp.springRest.service.CarService;
import com.springboot.myapp.springRest.entity.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/cars")
public class CarController {

    private CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping()
    public List<Car> getAll(){
        return carService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Car> getCarById(@PathVariable int id){
        return carService.getOne(id);
    }

    @PostMapping()
    public Car save(@RequestBody Car car){
        car.setId(0);
        Car savedCar = carService.save(car);

        return savedCar;
    }

    @DeleteMapping("/{id}")
    public void deleteCarById(@PathVariable int id){
        carService.delete(id);
    }

    @PutMapping()
    public Car update(@RequestBody Car car){
        Car savedCar = carService.save(car);

        return savedCar;
    }
}
