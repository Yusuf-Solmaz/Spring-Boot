package com.springboot.myapp.springRest.controller;

import com.springboot.myapp.springRest.entity.Car;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/car")
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
        return carList.get(id-1);
    }
}
