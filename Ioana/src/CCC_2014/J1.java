package CCC_2014;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*

Problem Description
You have trouble remembering which type of triangle is which. You write a program to help. Your program reads in three
angles (in degrees).
• If all three angles are 60, output Equilateral.
• If the three angles add up to 180 and exactly two of the angles are the same, output Isosceles.
• If the three angles add up to 180 and no two angles are the same, output Scalene.
• If the three angles do not add up to 180, output Error.

Input Specification
The input consists of three integers, each on a separate line. Each integer will be greater than 0 and less than 180.

Output Specification
Exactly one of Equilateral, Isosceles, Scalene or Error will be printed on one line.

Sample Input 1
60
70
50
Output for Sample Input 1
Scalene

Sample Input 2
60
75
55
Output for Sample Input 2
Error
 */
public class J1 {
    int angle1, angle2, angle3;

    public J1() throws FileNotFoundException {
        var file = new File("Data/CCC_2014/J1");
        var scanner = new Scanner(file);

        angle1 = scanner.nextInt();
        angle2 = scanner.nextInt();
        angle3 = scanner.nextInt();
    }

    public String answer(){

        if(angle1 + angle2 + angle3 == 180){
            if(angle1 == angle2 && angle1 == angle3) {
                return "Equilateral";
            } else if(angle1 == angle2 || angle1 == angle3 || angle2 == angle3){
                return "Isosceles";
            } else {
                return "Scalene";
            }
        } else {
            return "Error";
        }
    }
}
