package CCC_2007;
/*
Problem J1: Who is in the middle?
Problem Description
In the story Goldilocks and the Three Bears, each bear had a bowl of porridge to eat while sitting at his/her favourite
chair. What the story didn’t tell us is that Goldilocks moved the bowls around on the table, so the bowls were not at
the right seats anymore. The bowls can be sorted by weight with the lightest bowl being the Baby Bear’s bowl, the medium
bowl being the Mama Bear’s bowl and the heaviest bowl being the Papa Bear’s bowl. Write a program that reads in three
weights and prints out the weight of Mama Bear’s bowl. You may assume all weights are positive integers less than 100.

Sample Input
10
5
8
Output for Sample Input
8
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J1 {
    int bowl1, bowl2, bowl3;

    public J1() throws FileNotFoundException{
        var file = new File("Data/CCC_2007/J1");
        var scanner = new Scanner(file);

        bowl1 = scanner.nextInt();
        bowl2 = scanner.nextInt();
        bowl3 = scanner.nextInt();
    }

    public int answer(){
        if(bowl1 > bowl2 && bowl1 > bowl3){
            return bowl1;
        } else if (bowl2 > bowl3){
            return bowl2;
        } else {
            return bowl3;
        }
    }
}
