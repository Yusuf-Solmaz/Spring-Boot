package com.springboot.myapp;

import com.springboot.myapp.hibernate.dao.StudentDao;
import com.springboot.myapp.hibernate.entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(
		scanBasePackages = {"com.springboot.myapp","com.springboot.util"})
public class MyappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyappApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDao studentDao){
		return runner -> {
			createStudent(studentDao);
		};
	}

	private void createStudent( StudentDao studentDao){
		Student student = new Student("Erkam","Solmaz");
		studentDao.save(student);
		System.out.println("Student saved!: "+student.getId());
	}
}
