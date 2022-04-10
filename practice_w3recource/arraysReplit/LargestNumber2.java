package arraysReplit;

import java.util.Arrays;
import java.util.Scanner;

public class LargestNumber2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int rows = inp.nextInt(), cols = inp.nextInt();
        int[][] arr = new int[rows][cols];
        for (int i = 0; i <= rows - 1; i++) {
            for (int j = 0; j <= cols - 1; j++) {
                arr[i][j] = inp.nextInt();
            }//end for cols
        }//end for rows

        //TODO write your code below
        int greatesNr = arr[0][0];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (greatesNr <= arr[i][j]) {
                    greatesNr = arr[i][j];
                }

            }

        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = greatesNr;

            }

        }
            //FINAL PRINT
            System.out.println(Arrays.deepToString(arr));

    }
}
