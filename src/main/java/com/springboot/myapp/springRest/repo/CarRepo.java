package com.springboot.myapp.springRest.repo;

import com.springboot.myapp.springRest.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface CarRepo extends JpaRepository<Car,Integer> {
    @Transactional
    @Modifying
    @Query("update Car c set c.color = ?1, c.brand = ?2 where c.id = ?3")
    int updateColorAndBrandById(String color, String brand, int id);


}
