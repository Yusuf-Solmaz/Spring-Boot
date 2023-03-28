package com.springboot.myapp.springRest.dao;

import com.springboot.myapp.springRest.entity.Car;

import java.util.List;
import java.util.Optional;


public interface CarDao {
    public void save(Car car);
    public Optional<Car> getOne(int id);
    public List<Car> getAll();
    public void update(String color, String brand);
    public void delete(int id);
}
