package com.springboot.myapp.hibernate.repo;

import com.springboot.myapp.hibernate.entity.Student;
import com.springboot.myapp.hibernate.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeacherRepo extends JpaRepository<Teacher,Integer> {

    @Query(value = "from Teacher WHERE lastName=:teacherLastName")
    List<Teacher> findLastnameWithQuerries(String teacherLastName);

}
