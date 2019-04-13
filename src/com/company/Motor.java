package com.company;

public class Motor {

    int model;
    double value;
    double horsePover;


    public Motor(int model, double value, double horsePover) {
        this.model = model;
        this.value = value;
        this.horsePover = horsePover;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "model=" + model +
                ", value=" + value +
                ", horsePover=" + horsePover +
                '}';
    }
}
