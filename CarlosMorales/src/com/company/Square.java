package com.company;

public class Square {
    float length;
    Square(float length) {
        this.length = length;
    }

    // def perimeter():

    public float perimeter(){
        return length * 4;
    }

    public float area(){
        return length * length;
    }
}
