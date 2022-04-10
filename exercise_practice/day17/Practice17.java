package day17;

import java.util.Scanner;

public class Practice17 {
    public static void main(String[] args) {
       /* Write a program that calculates the sum of numbers entered by the
        user until user enters a negative number.*/

        int sum=0;
        boolean l=true;
        while (l){
            Scanner in=new Scanner(System.in);
            int number= in.nextInt();
            if (number<0)
                break;
            sum+=number;
        }









        System.out.println(sum);
    }
}
