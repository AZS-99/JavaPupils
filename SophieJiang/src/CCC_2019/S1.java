package CCC_2019;

/*
Problem J4/S1: Flipper Problem Description
You are trying to pass the time while at the optometrist. You notice there is a grid of four numbers:
                                                1 2
                                                3 4

You see lots of mirrors and lenses at the optometrist, and wonder how flipping the grid horizontally or vertically would
change the grid.
Specifically, a “horizontal” flip (across the horizontal centre line) would take the original grid of four numbers and
result in:
                                                3 4
                                                1 2

A “vertical” flip (across the vertical centre line) would take the original grid of four numbers and result in:
                                                2 1
                                                4 3
Your task is to determine the final orientation of the numbers in the grid after a sequence of horizontal and vertical
flips.

Input Specification
The input consists of one line, composed of a sequence of at least one and at most 1 000 000 characters. Each character
is either H, representing a horizontal flip, or V, representing a vertical flip.
For 8 of the 15 available marks, there will be at most 1 000 characters in the input.

Output Specification
Output the final orientation of the four numbers. Specifically, each of the two lines of output will contain two
integers, separated by one space.

Sample Input 1
HV
Output for Sample Input 1
4 3
2 1
 */

import java.util.Scanner;

public class S1 {
    int[][] org = {{1,2},{3,4}};
    String l;

    public S1(){
        Scanner in = new Scanner(System.in);
        l = in.next();
    }

    public void solve(){
        int h = 0;
        int v = 0;

        for(int i=0;i<l.length();i++){
            if(l.charAt(i)=='H') h++;
            else v++;
        }

        if(h%2 == 1){
            int[][] m = new int[2][2];
            m[0][0] = org[0][1];
            m[0][1] = org[0][0];
            m[1][0] = org[1][1];
            m[1][1] = org[1][0];
            org = m;
        }
        if(v%2 == 1){
            int[][] n = new int[2][2];
            n[0][0] = org[1][0];
            n[0][1] = org[1][1];
            n[1][0] = org[0][0];
            n[1][1] = org[0][1];
            org = n;
        }

        for(int i=0; i<2;i++){
            for(int j=0;j<2;j++){
                System.out.print(org[i][j]+ " ");
            }
            System.out.println();
        }
    }

}
