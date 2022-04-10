package day19;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
       /* 1. Write a program that can calculate the area and perimeter of a
        circle:
        1. Ask the user "Enter the radius of the
        circle:"
        if user enters 0 or negative numbers,
                terminate the program after displaying the error message "Invalid Entry
        for the radius of the circle"
        2. Display:
        1. Diameter of circle
        2. Area of circle
        3. Perimeter of circle
        3. Ask the user "Would you like to calculate
        another circle?"
        If "yes" --> repeat the
        previous steps
        If "No" --> Print "Thank you
        for using Cydeo Circle Calculator APP"
        If user enters an invalid entry, ask
        the user to re-enter until user provides a valid entry
        2. Write a program that can calculate the area and perimeter of a
        Square:
        1. Ask the user "Enter the side of the
        square:"
        if user enters 0 or negative numbers,
                terminate the program after displaying the error message "Invalid Entry
        for the side of the square"
        2. Display:
        1. Area of square
        2. Perimeter of square
        3. Ask the user "Would you like to calculate
        another Square?"
        If "yes" --> repeat the
        previous steps
        If "No" --> Print "Thank you
        for using Cydeo Square Calculator APP"
        If user enters an invalid entry, ask
        the user to re-enter until user provides a valid entry*/

        Scanner in =new Scanner(System.in);

        int radius, diameter;
        double perimiter, area, pi=3.14;
        String continuoing;

        while (true){
            System.out.println("Enter the radius of the circle:");
            radius= in.nextInt();
            if (radius<=0){
                System.err.println("Invalid Entry for the radius of the circle");
                System.exit(0);
            }
            diameter=2*radius;
            area=radius*radius*pi;
            perimiter=diameter*pi;

            System.out.println("diameter = " + diameter);
            System.out.println("area = " + area);
            System.out.println("perimiter = " + perimiter);

            System.out.println("Would you like to calculate another circle?");
            while (true){
                continuoing=in.next().toLowerCase();
                if (continuoing.equals("yes")|| continuoing.equals("vo")){
                    break;

                }

                if (continuoing.equals("no")){
                    System.out.println("Thank you for using Cydeo Square Calculator APP");
                    System.exit(0);

                }
                System.out.println("Invalid answer");
                System.out.println("Please reanswer the question");
                System.out.println("Would you like to calculate another circle?");



            }



        }

    }
}
