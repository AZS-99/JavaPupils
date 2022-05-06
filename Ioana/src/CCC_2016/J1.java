package CCC_2016;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*

Problem Description
Each player in a tournament plays six games. There are no ties. The tournament director places the players in groups
based on the results of games as follows:
• if a player wins 5 or 6 games, they are placed in Group 1;
• if a player wins 3 or 4 games, they are placed in Group 2;
• if a player wins 1 or 2 games, they are placed in Group 3;
• if a player does not win any games, they are eliminated from the tournament.

Write a program to determine which group a player is placed in.

Input Specification
The input consists of six lines, each with one of two possible letters: W (to indicate a win) or L (to indicate a loss).

Output Specification
The output will be either 1, 2, 3 (to indicate which Group the player should be placed in) or -1 (to indicate the player
has been eliminated).

Sample Input 1
W
L
W
W
L
W
Output for Sample Input 1
2

Sample Input 2
L
L
L
L
L
L
Output for Sample Input 2
-1
 */
public class J1 {
    int wins;
    public J1() throws FileNotFoundException {
        var file = new File("Data/CCC_2016/J1");
        var scanner = new Scanner(file);
        wins = 0;

        for(var i = 0; i < 6; i++){
            var ch = scanner.nextLine();
            if(ch.equals("W")){
                wins++;
            }
        }
    }

    public int foo(){
        if(wins > 4 && wins < 7 ){
            return 1;
        } else if(wins > 2 && wins < 5){
            return 2;
        } else if(wins > 0 && wins < 3){
            return 3;
        } else {
            return -1;
        }
    }
}
