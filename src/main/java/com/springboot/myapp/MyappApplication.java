package com.springboot.myapp;

import com.springboot.myapp.hibernate.dao.StudentDao;
import com.springboot.myapp.hibernate.dao.TeacherDao;
import com.springboot.myapp.hibernate.entity.Student;
import com.springboot.myapp.hibernate.entity.Teacher;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Optional;

@SpringBootApplication(
		scanBasePackages = {"com.springboot.myapp","com.springboot.util"})
public class MyappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyappApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(TeacherDao teacherDao){
		return runner -> {
			//createStudent(studentDao);
			//findStudentById(studentDao);
			//createTeacher(teacherDao);
			//findTeacherById(teacherDao);
			//findAllTeachers(teacherDao);
			//findAllStudents(studentDao);
			//findAllByLastName(teacherDao);
			//findByNameAndLastName(studentDao);
			updateTeacher(teacherDao);
		};
	}

	private void updateTeacher(TeacherDao teacherDao) {
		int id=2;
		String name="Ahmet";
		String lastName="Solmaz";
		String branch="Biology";
		teacherDao.updateTeacher(name,lastName,branch,id);
		System.out.println("Teacher Updated!");
	}

	private void findByNameAndLastName(StudentDao studentDao) {
		String name="Yusuf";
		String lastName="Solmaz";
		System.out.println(studentDao.findByNameAndLastName(name,lastName));
	}

	private void findAllByLastName(TeacherDao teacherDao) {
		String lastName="Mücahit";
		for(Teacher teacher:teacherDao.findAllByLastName(lastName)){
			System.out.println(teacher);
		}
	}

	private void findAllStudents(StudentDao studentDao) {
		for(Student student: studentDao.findAllStudents()){
			System.out.println(student);
		}
	}

	private void findAllTeachers(TeacherDao teacherDao) {
		if (teacherDao.findAllTeacher()==null){
			System.out.println("There is no such teachers.");
		}
		else{
			for (Teacher teacher: teacherDao.findAllTeacher()){
				System.out.println(teacher);
			}
		}
	}

	private void findTeacherById(TeacherDao teacherDao) {
		int id=15;
		Optional<Teacher> teacher = teacherDao.findById(id);
		if(teacher.isEmpty()){
			System.out.println("There is no such teacher.");
		}
		else{
			System.out.println("Teacher Found!");
			System.out.println(teacher);
		}
	}

	private void createTeacher(TeacherDao teacherDao) {
		Teacher teacher = new Teacher("Yusuf","Mücahit","Math");
		teacherDao.save(teacher);
		System.out.println("Teacher Saved!");
	}

	private void createStudent( StudentDao studentDao){
		Student student = new Student("Yusuf","Solmaz");
		studentDao.save(student);
		System.out.println("Student saved!: "+student.getId());
	}
	private void findStudentById(StudentDao studentDao){
		int id=2;
		if (studentDao.findById(id)!=null){
			System.out.println("Student Found");
			System.out.println(studentDao.findById(id));
		}
		else{
			System.out.println("There is no such student.");
		}
		}
}
