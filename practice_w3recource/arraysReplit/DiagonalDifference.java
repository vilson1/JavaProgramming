package arraysReplit;

import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] matrix = new int[][]{ {scan.nextInt(), scan.nextInt(), scan.nextInt()},{scan.nextInt(), scan.nextInt(), scan.nextInt()},
                {scan.nextInt(), scan.nextInt(), scan.nextInt()}};
        int result = 0;

        int sum1=0;
        int sum2=0;
        for (int i = 0; i < 3; i++) {
           sum1+=matrix[i][i];
            sum2+=matrix[i][3-1-i];
        }
        result=sum1-sum2;
        System.out.println(sum1);
        System.out.println(sum2 );






        // FINAL PRINT
        System.out.println(Math.abs(result));
    }
}
