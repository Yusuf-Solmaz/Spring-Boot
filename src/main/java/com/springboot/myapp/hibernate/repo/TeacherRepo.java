package com.springboot.myapp.hibernate.repo;

import com.springboot.myapp.hibernate.entity.Student;
import com.springboot.myapp.hibernate.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface TeacherRepo extends JpaRepository<Teacher,Integer> {

    @Transactional
    @Modifying
    @Query("update Teacher t set t.firstName = ?1, t.lastName = ?2, t.branch = ?3 where t.id = ?4")
    void update(String firstName, String lastName, String branch, int id);



    @Query(value = "from Teacher WHERE lastName=:teacherLastName")
    List<Teacher> findLastnameWithQuerries(String teacherLastName);

}
