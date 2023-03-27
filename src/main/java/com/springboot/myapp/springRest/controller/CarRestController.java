package com.springboot.myapp.springRest.controller;

import com.springboot.myapp.springRest.entity.Car;
import com.springboot.myapp.springRest.exceptions.CarErrorResponse;
import com.springboot.myapp.springRest.exceptions.CarNotFoundException;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarRestController {
    List<Car> carList = new ArrayList<>();


    @PostConstruct
    public void loadData(){
        carList.add(new Car(1,"Mercedes","Black"));
        carList.add(new Car(2,"Fiat","Blue"));
    }


    @GetMapping("/listCars")
    public List<Car> listCar(){
        return carList;
    }

    @GetMapping("/findMyCar/{id}")
    public Car findMyCar(@PathVariable int id){
        if (carList.size()<id || 0>=id){
            throw new CarNotFoundException("Car not found!");
        }
        return carList.get(id-1);
    }


}
