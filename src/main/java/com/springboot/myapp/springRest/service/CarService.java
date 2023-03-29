package com.springboot.myapp.springRest.service;

import com.springboot.myapp.springRest.entity.Car;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface CarService {
    public void save(Car car);
    public Optional<Car> getOne(int id);
    public List<Car> getAll();
    public void update(Car car);
    public void delete(int id);
}
