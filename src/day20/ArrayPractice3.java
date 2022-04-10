package day20;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("How many numbers want to enter");
        int num= in.nextInt();
        if (num<=0)
        {
            System.err.println("Invalid enter");
            System.exit(0);
        }
        int[] number=new  int[num];
        for (int i = 0; i < num; i++) {
            System.out.println("Enter a number");
            number[i]=in.nextInt();

        }
        System.out.println(Arrays.toString(number));




    }



}
