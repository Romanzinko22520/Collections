package com.company;

public class Wheel {
    String vyrobnyk;
    double diameter;


    public Wheel(String vyrobnyk, double diameter) {
        this.vyrobnyk = vyrobnyk;
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "vyrobnyk='" + vyrobnyk + '\'' +
                ", diameter=" + diameter +
                '}';
    }
}

