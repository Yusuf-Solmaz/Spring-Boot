package com.springboot.myapp.springRest.controller;

import com.springboot.myapp.springRest.dao.CarDao;
import com.springboot.myapp.springRest.entity.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class CarController {

    private CarDao carDao;

    @Autowired
    public CarController(CarDao carDao) {
        this.carDao = carDao;
    }

    @GetMapping("/cars")
    public List<Car> getAll(){
        return carDao.getAll();
    }

    @GetMapping("cars/{id}")
    public Optional<Car> getCarById(@PathVariable int id){
        return carDao.getOne(id);
    }

    @PostMapping("cars")
    public void save(@RequestBody Car car){
        carDao.save(car);
    }



}
