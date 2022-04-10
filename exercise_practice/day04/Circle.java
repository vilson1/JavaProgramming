package day04;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        3. Create a class named Circle, write a program that can calculate
//                the area & perimeter of any given Circle

        System.out.println("Enter the radius");
        int radius = in.nextInt();

        int diameter=2*radius;
        double PI=3.14;
        double area= PI*radius*radius;
        double perimeter = diameter*PI;

        System.out.println("diameter = " + diameter);
        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);


    }
}
