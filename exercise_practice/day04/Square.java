package day04;

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {

//        1. Create a class named Square, write a program that can calculate
//                the area & perimeter of any given square
        Scanner in= new Scanner(System.in);

        System.out.println("enter the side of the square");
        int side = in.nextInt();

        int area= side*side;
        int perimeter = 4*side;

        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);

    }
}
