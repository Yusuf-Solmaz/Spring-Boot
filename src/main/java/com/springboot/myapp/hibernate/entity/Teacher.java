package com.springboot.myapp.hibernate.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "teacher")
@NoArgsConstructor
@Getter
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "branch")
    private String branch;

    public Teacher(String firstName, String lastName, String branch) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", branch='" + branch + '\'' +
                '}';
    }
}
