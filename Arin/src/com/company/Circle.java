package com.company;

public class Circle {
    double diameter;

    public Circle(double radius) {
        diameter = 2 * radius;
    }

    public double get_circumference() {
        return diameter * Math.PI;
    }

    public double area() {
        return Math.pow(diameter/2, 2) * Math.PI;
    }


}
