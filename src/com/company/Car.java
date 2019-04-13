package com.company;

public class Car {
    String model;
    int number;
    int year;
    String color;
    Wheel carWheel;
    Motor motor;


    public Car(String model, int number, int year, String color, Wheel carWheel, Motor motor) {
        this.model = model;
        this.number = number;
        this.year = year;
        this.color = color;
        this.carWheel = carWheel;
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", number=" + number +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", carWheel=" + carWheel +
                ", motor=" + motor +
                '}';
    }
}
