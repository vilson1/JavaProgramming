package day04;

import java.util.Scanner;

public class KgToPounds {
    public static void main(String[] args) {
//        4. Create a class named KgToPounds, write a program that can convert
//                kg (int) to pounds (double)
        Scanner in = new Scanner(System.in);


        System.out.println("Enter Kg");
        int kg = in.nextInt();

        double pound= kg*2.2;
        System.out.println("pound = " + pound);

    }
}
