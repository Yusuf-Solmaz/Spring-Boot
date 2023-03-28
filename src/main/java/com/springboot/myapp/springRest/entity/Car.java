package com.springboot.myapp.springRest.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "car")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "id")
    private int id;

    @JoinColumn(name = "brand")
    private String brand;

    @JoinColumn(name = "color")
    private String color;

    @JoinColumn(name = "brand")
    public String getBrand() {
        return brand;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Car(int id, String brand, String color) {
        this.id = id;
        this.brand = brand;
        this.color = color;
    }

    public Car( String brand, String color) {
        this.brand = brand;
        this.color = color;
    }



    public Car() {
    }
}
