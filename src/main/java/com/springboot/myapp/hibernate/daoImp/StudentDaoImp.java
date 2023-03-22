package com.springboot.myapp.hibernate.daoImp;

import com.springboot.myapp.hibernate.dao.StudentDao;
import com.springboot.myapp.hibernate.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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

    @Override
    public Student findById(Integer id) {
        return entityManagerity.find(Student.class,id);
    }

    @Override
    public List<Student> findAllStudents() {
        TypedQuery<Student> theQuerry = entityManagerity.createQuery("from Student ",Student.class);
        return theQuerry.getResultList();
    }

    @Override
    public Student findByNameAndLastName(String name,String lastName) {
        TypedQuery<Student> query = entityManagerity.createQuery("from Student where studentName=:theName and studentLastName=:theLastName",Student.class);
        query.setParameter("theName",name);
        query.setParameter("theLastName",lastName);

        return query.getSingleResult();
    }

    @Override
    public void updateStudent(Student student) {
        entityManagerity.merge(student);
    }


}
