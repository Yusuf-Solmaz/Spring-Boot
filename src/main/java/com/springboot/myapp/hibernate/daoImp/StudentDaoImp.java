package com.springboot.myapp.hibernate.daoImp;

import com.springboot.myapp.hibernate.dao.StudentDao;
import com.springboot.myapp.hibernate.entity.Student;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Primary
public class StudentDaoImp implements StudentDao {

    private EntityManager entityManagerity;

    @Autowired
    public StudentDaoImp(EntityManager entityManagerity) {
        this.entityManagerity = entityManagerity;
    }

    @Override
    @Transactional
    public void save(Student student) {
        entityManagerity.persist(student);
    }
}
