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
    public Car save(Car car) {
        Car savedCar= carRepo.save(car);
        System.out.println("Car saved!");
        return savedCar;
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
    public void update(Car car) {
        if (carRepo.findById(car.getId()).isEmpty())
        {
            throw new CarNotFoundException("There is no such a car!");
        }
        System.out.println("Car updated!");
        carRepo.updateColorAndBrandById(car.getColor(), car.getBrand(), car.getId());
    }

    @Override
    public void delete(int id) {
        System.out.println("Car deleted!");
        carRepo.deleteById(id);
    }
}
