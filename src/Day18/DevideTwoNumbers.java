package Day18;

import java.util.Scanner;

public class DevideTwoNumbers {
    public static void main(String[] args) {
        //write a program that can devide two positive numbers without using dividion or multiplication operators.

        int nr1,nr2;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        nr1= in.nextInt();
        nr2= in.nextInt();
        int count=0;

        while (nr1>=nr2)
        {
            nr1 -= nr2;
            count ++ ;
        }
        System.out.println(count+ "rem "+nr1);


    }
}
