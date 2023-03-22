package com.springboot.myapp.hibernate.dao;


import com.springboot.myapp.hibernate.entity.Student;

import java.util.List;

public interface StudentDao {
    void save(Student student);

    Student findById(Integer id);

    List<Student> findAllStudents();

    Student findByNameAndLastName(String name,String lastName);

    void updateStudent(Student student);

    void deleteStudent(int id);
}
