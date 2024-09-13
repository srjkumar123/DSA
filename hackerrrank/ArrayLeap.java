package hackerrrank;

import java.util.Scanner;


public class ArrayLeap {

    public static boolean canWin(int leap, int[] game, int index) {
        if(index<0 || game[index]==1){ //if index less than zero or we marked visited position 1 so return false
            return false;
        }
        if((index +1 )>game.length-1 || (index +leap )>game.length-1){ // +1 ya +leap hame array length k bahar le
            // jata ha to we win game
            return true;
        }
        game[index] = 1; //hum visited position ko mark kr rhe ha taki repeatation na ho


        //recursive call there are 3 possible move -1 +1 and  leap
        return canWin(leap, game, index-1) || canWin(leap, game, index+1) || canWin(leap, game, index+leap);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt(); //no. of queries
        while (q-- > 0) { // short hand for decrement
            int n = scan.nextInt(); //no of index in the game array
            int leap = scan.nextInt(); //no of leaps you want to take

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game,0)) ? "YES" : "NO" );
        }
        scan.close();
    }
}