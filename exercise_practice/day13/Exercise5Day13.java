package day13;

import java.util.Scanner;

public class Exercise5Day13 {
    public static void main(String[] args) {

        /*5. Write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three
                characters
        if the string has less than or equal 3 characters, print the
        string itself*/

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");

        String s= in.next();
        if (s.isEmpty())
            System.out.println("String is emty");
        else if (s.length()>3)
            System.out.println(s.substring(s.length()-3));
        else
            System.out.println(s);
    }
}
