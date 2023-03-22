package com.springboot.myapp.hibernate.daoImp;

import com.springboot.myapp.hibernate.dao.TeacherDao;
import com.springboot.myapp.hibernate.entity.Student;
import com.springboot.myapp.hibernate.entity.Teacher;
import com.springboot.myapp.hibernate.repo.TeacherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Component
public class TeacherDaoImp implements TeacherDao {

    private TeacherRepo teacherRepo;

    @Autowired
    public TeacherDaoImp(TeacherRepo teacherRepo) {
        this.teacherRepo = teacherRepo;
    }

    @Override
    @Transactional
    public void save(Teacher teacher) {
        teacherRepo.save(teacher);
    }

    @Override
    public Optional<Teacher> findById(Integer id) {
        return teacherRepo.findById(id);
    }

    @Override
    public List<Teacher> findAllTeacher() {
        return teacherRepo.findAll();
    }

    @Override
    public List<Teacher> findAllByLastName(String lastName) {
        return teacherRepo.findLastnameWithQuerries(lastName);
    }
}
