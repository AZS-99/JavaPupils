package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("What is the length");
        var scanner = new Scanner(System.in);
        var length = scanner.nextFloat();
        var square  = new Square(length);
        var perimeter = square.perimeter();
        System.out.println(perimeter);
        var area = square.area();
        System.out.println(area);
    }
}
