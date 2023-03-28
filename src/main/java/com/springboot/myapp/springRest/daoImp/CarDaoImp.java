package com.springboot.myapp.springRest.daoImp;

import com.springboot.myapp.springRest.dao.CarDao;
import com.springboot.myapp.springRest.entity.Car;
import com.springboot.myapp.springRest.repo.CarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Component
public class CarDaoImp implements CarDao {

    private CarRepo carRepo;

    @Autowired
    public CarDaoImp(CarRepo carRepo) {
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
            System.out.println("There is no such a car!");
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
    public void update(String color, String brand) {
        System.out.println("Car updated!");
        carRepo.updateColorAndBrandBy(color,brand);
    }

    @Override
    @Transactional
    public void delete(int id) {
        System.out.println("Car deleted!");
        carRepo.deleteById(id);
    }
}
