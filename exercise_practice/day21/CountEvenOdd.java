package day21;

import java.util.Scanner;

public class CountEvenOdd {
    public static void main(String[] args) {
        //2. Write a program that can count the even and odd number from an array of integers

        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i]=in.nextInt();

        }

        int countEven=0;
        int countOdd=0;
        for (int i : arr) {
            if (i%2==0){
                countEven++;
            }
            else countOdd++;


        }
        System.out.println(countEven);
        System.out.println(countOdd);
    }
}


