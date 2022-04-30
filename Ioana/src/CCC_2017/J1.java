package CCC_2017;
/*
Problem Description
A common problem in mathematics is to determine which quadrant a given point lies in. There are four quadrants, numbered
from 1 to 4
For example, the point A, which is at coordinates (12, 5) lies in quadrant 1 since both its x and y values are positive,
and point B (-12, 5) lies in quadrant 2 since its x value is negative and its y value is positive.
Your job is to take a point and determine the quadrant it is in. You can assume that neither of the two coordinates will
be 0.

Input Specification
The first line of input contains the integer x. The second line of input contains the integer y.

Output Specification
Output the quadrant number (1, 2, 3 or 4) for the point (x, y).

Sample Input 1
12
5
Output for Sample Input 1
1

Sample Input 2
9
-13
Output for Sample Input 2
4
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J1 {

    int x;
    int y;

    public J1() throws FileNotFoundException {
        var file = new File("Data/CCC_2017/J1");
        var scanner = new Scanner(file);
        x = scanner.nextInt();
        y = scanner.nextInt();


        if (x > 0) {
            if (y > 0) {
                System.out.println(1);
            } else {
                System.out.println(4);
            }
        } else {
            if (y < 0) {
                System.out.println(3);
            } else {
                System.out.println(2);
            }

        }

//        if (x > 0 && y > 0){
//            System.out.println(1);
//        } else if (x < 0 && y > 0){
//            System.out.println(2);
//        } else if (x < 0 && y < 0){
//            System.out.println(3);
//        } else {
//            System.out.println(4);
//        }
    }
}
