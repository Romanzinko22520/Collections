package com.company;

import java.util.Comparator;

public class CompareCar implements Comparator<Car> {


    @Override
    public int compare(Car o1, Car o2) {
        return o2.year-o1.year ;
    }
}

