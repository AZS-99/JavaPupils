package com.company;

public class Hexagon {
    double side;


    Hexagon(double side){
        this.side = side;
    }

    public double perimeter (){
        return side * 6;
    }

    public double area () {
        return 3 * Math.sqrt(3) * side * side / 2;
    }
}
