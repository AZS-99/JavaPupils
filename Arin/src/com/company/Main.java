package com.company;

public class Main {

    public static void main(String[] args) {
//	    var circle1 = new Circle(3);
//        System.out.println(circle1.get_circumference());
//
//        var area1 = circle1.area();
//        System.out.println(area1);

        var rect1 = new Rectangle(3,4);

        var area2 = rect1.area();
        System.out.println(area2);

        var per = rect1.perimeter();
        System.out.println(per);
    }
}
