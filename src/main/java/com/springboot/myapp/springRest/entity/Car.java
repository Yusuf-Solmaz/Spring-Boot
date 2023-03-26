package com.springboot.myapp.springRest.entity;

public class Car {
    private int id;
    private String brand;
    private String color;

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


    public Car() {
    }
}
