package day20;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
       /* 5.  Write a program that can reverse an array of integers and
        returns it as new array*/


        Scanner in = new Scanner(System.in);
        int arrlength= in.nextInt();

        int[] arr=new int[arrlength];
        for (int i = 0; i < arrlength; i++) {
            arr[i]=in.nextInt();
        }

        int[] reverse=new int[arrlength];
        for (int i = arrlength-1,j=0; i >=0 ; i--,j++) {
            reverse[j]=arr[i];

        }
        System.out.println(Arrays.toString(reverse));

    }
}
