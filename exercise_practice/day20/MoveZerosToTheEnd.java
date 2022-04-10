package day20;

import java.util.Arrays;
import java.util.Scanner;

public class MoveZerosToTheEnd {
    public static void main(String[] args) {
        //6. write a program that can move all the zeros to the end of the array

        Scanner in = new Scanner(System.in);
        int arrlength= in.nextInt();

        int[] arr=new int[arrlength];
        for (int i = 0; i < arrlength; i++) {
            arr[i]=in.nextInt();
        }

        Arrays.sort(arr);

        int[] movezeros=new int[arrlength];
        for (int i = arrlength-1,j=0; i >=0 ; i--,j++) {
            movezeros[j]=arr[i];

        }
        System.out.println(Arrays.toString(movezeros));


    }
}
