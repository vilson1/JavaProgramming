package Methods;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char [] game = new char[9];
        for(int i=0; i < game.length; i++) {
            game[i] = in.next().charAt(0);
        }

        System.out.println(won(game));
    }



    public static String won(char[] x){
        String ch="";

        if (x[0]==x[1] && x[0]==x[2]|| x[3]==x[4] && x[3]==x[5] || x[6]==x[7] && x[6]==x[8]){
            if (x[0]=='X' || x[3]=='X' || x[6]=='X') {
                ch=""+x[0];
            }
            else
                ch=""+x[0];
        }
        else if (x[0]==x[3] && x[0]==x[6] || x[1]==x[4] && x[1]==x[7] || x[2]==x[5] && x[2]==x[8]){
            if (x[0]=='X' || x[1]=='X' || x[2]=='X'){
                ch=""+x[0];
            }
            else
                ch=""+x[0];

        }
        else if (x[0]==x[4] && x[0]==x[8] || x[2]==x[4] && x[2]==x[6]){
            if (x[0]=='X' || x[2]=='X'){
                ch=""+x[0];
            }
            else{
                ch=""+x[0];
            }




        }
        else
            System.out.println("There is no winner!");

        String result="Player "+ch+" won";

        return result;
    }
}
