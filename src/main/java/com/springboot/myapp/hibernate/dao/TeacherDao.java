package com.springboot.myapp.hibernate.dao;


import com.springboot.myapp.hibernate.entity.Student;
import com.springboot.myapp.hibernate.entity.Teacher;

import java.util.List;
import java.util.Optional;

public interface TeacherDao {

    void save(Teacher teacher);
    Optional<Teacher> findById(Integer id);
    List<Teacher> findAllTeacher();

    List<Teacher> findAllByLastName(String lastName);

    void updateTeacher(String firstName, String lastName, String branch, int id);
}
