package com.springboot.myapp.hibernate.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "student")
@NoArgsConstructor
@Getter
@Setter
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "student_name")
    private String studentName;

    @Column(name = "student_last_name")
    private String studentLastName;

    public Student(String studentName, String studentLastName) {
        this.studentName = studentName;
        this.studentLastName = studentLastName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", studentName='" + studentName + '\'' +
                ", studentLastName='" + studentLastName + '\'' +
                '}';
    }
}
