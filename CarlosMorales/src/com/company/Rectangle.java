package com.company;

public class Rectangle {
    double width, length;

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public double perimeter(){
        return width * 2 + length * 2;
    }

    public double area(){
        return width * length;
    }
}

