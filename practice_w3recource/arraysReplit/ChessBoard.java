package arraysReplit;

import java.util.Arrays;

public class ChessBoard {
    public static void main(String[] args) {
        String[][] chessBoard = new String[8][8];
        //WRITE YOUR CODE HERE
        for (int i = 0; i <8; i++) {

            for (char j = 'a', k=0; j <='h'&& k<8 ; j++, k++) {
                chessBoard[i][k]=""+(i+1)+j;


            }
            
        }



        //DO NOT CHANGE
        System.out.println(Arrays.deepToString(chessBoard));
    }
}
