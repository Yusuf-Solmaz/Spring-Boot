package com.springboot.myapp.springRest.repo;


import com.springboot.myapp.springRest.entity.Trainer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RepositoryRestResource(path = "members")
public interface TrainerRepo extends JpaRepository<Trainer,Integer> {
    List<Trainer> findByName(@Param("name") String name);

}
