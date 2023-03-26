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
        if (carList.size()<id || 0>=id){
            throw new CarNotFoundException("Car not found!");
        }
        return carList.get(id-1);
    }

    @ExceptionHandler
    public ResponseEntity<CarErrorResponse> responseEntity (CarNotFoundException exception){
        CarErrorResponse errorResponse = new CarErrorResponse();
        errorResponse.setStatus(HttpStatus.NOT_FOUND.value());
        errorResponse.setMessage(exception.getMessage());
        errorResponse.setTime(System.currentTimeMillis());
        return new ResponseEntity<>(errorResponse,HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler
    public ResponseEntity<CarErrorResponse> responseE (Exception exc){
        CarErrorResponse errorResponse = new CarErrorResponse();
        errorResponse.setStatus(HttpStatus.BAD_REQUEST.value());
        errorResponse.setMessage("Enter a number!");
        errorResponse.setTime(System.currentTimeMillis());
        return new ResponseEntity<>(errorResponse,HttpStatus.BAD_REQUEST);
    }
}
