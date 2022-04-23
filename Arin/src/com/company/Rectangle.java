package com.company;

public class Rectangle {
    double width;
    double length;

    public Rectangle(double length, double width){
        this.width = width;
        this.length = length;
    }

    public double area(){
        return this.width * this.length;
    }

    public double perimeter(){
        return this.width*2 + this.length*2;
    }

}
