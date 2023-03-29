package com.springboot.myapp.springRest.repo;


import com.springboot.myapp.springRest.entity.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainerRepo extends JpaRepository<Trainer,Integer> {
}
