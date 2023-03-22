package com.springboot.myapp.hibernate.dao;


import com.springboot.myapp.hibernate.entity.Student;

import java.util.List;

public interface StudentDao {
    void save(Student student);

    Student findById(Integer id);

    List<Student> findAllStudents();
}
