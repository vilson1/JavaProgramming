package day22;

import java.util.Arrays;
import java.util.Scanner;

public class Reverse2DArray {
    public static void main(String[] args) {
        //1. Write a program that can reverse a two dimensional array (return new array)


        Scanner in = new Scanner(System.in);
        int colom= in.nextInt();
        int row= in.nextInt();

        int[][] arr=new int[row][colom];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colom; j++) {
                arr[i][j]=in.nextInt();

            }

        }
        System.out.println(Arrays.deepToString(arr));
        int a=0,b=0;
        int[][] arr1=new int[row][colom];

        for (int i = row-1; i >=0; i--) {
            for (int j = colom-1; j >=0; j--) {

                arr1[a][b]=arr[i][j];
                b++;
            }
            a++;

        }
        System.out.println(Arrays.deepToString(arr1));
    }
}
