package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter the width");
        var scanner = new Scanner(System.in);
        var width = scanner.nextInt();

        System.out.println("Enter the length");
        var length = scanner.nextInt();

        var rectangle = new Rectangle(width, length);
        var perimeter = rectangle.perimeter();
        var area = rectangle.area();
        System.out.println(perimeter);
        System.out.println();
    }

}
