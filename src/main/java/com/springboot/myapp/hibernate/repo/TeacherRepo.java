package com.springboot.myapp.hibernate.repo;

import com.springboot.myapp.hibernate.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepo extends JpaRepository<Teacher,Integer> {
}
