package com.company;

public class Circle {
    float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    public float area() {
        return (float) Math.PI * radius * radius;
    }


    public float circumference() {
        return (float) Math.PI * 2 * radius;
    }
}
