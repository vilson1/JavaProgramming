package day20;

import java.util.Scanner;

public class ArraysIntro {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        String[] months = {"January","February","March","April","May","June","July","August","September","October","December"};
        int num= in.nextInt();

        if (num<1 || num>12)
        {
            System.err.println("Invalid number");
            System.exit(0);
        }
        System.out.println(months[num-1]);
    }
}
