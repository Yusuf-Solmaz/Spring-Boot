package com.springboot.myapp.springRest.serviceImp;

import com.springboot.myapp.springRest.exceptions.CarNotFoundException;
import com.springboot.myapp.springRest.service.CarService;
import com.springboot.myapp.springRest.entity.Car;
import com.springboot.myapp.springRest.repo.CarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CarServiceImp implements CarService {

    private CarRepo carRepo;

    @Autowired
    public CarServiceImp(CarRepo carRepo) {
        this.carRepo = carRepo;
    }

    @Override
    @Transactional
    public void save(Car car) {
        carRepo.save(car);
        System.out.println("Car saved!");
    }

    @Override
    public Optional<Car> getOne(int id) {
        if (carRepo.findById(id).isEmpty()){
            throw new  CarNotFoundException("There is no such a car!");
        }
        System.out.println("Car found!");
        return carRepo.findById(id);
    }

    @Override
    public List<Car> getAll() {
        return carRepo.findAll();
    }

    @Override
    @Transactional
    public void update(int id,String color, String brand) {
        System.out.println("Car updated!");
        carRepo.updateColorAndBrandById(color,brand,id);
    }

    @Override
    @Transactional
    public void delete(int id) {
        System.out.println("Car deleted!");
        carRepo.deleteById(id);
    }
}
