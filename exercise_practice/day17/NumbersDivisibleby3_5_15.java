package day17;

import java.util.Scanner;

public class NumbersDivisibleby3_5_15 {
    public static void main(String[] args) {
       /* 4. Write a program that can print the numbers between 1 ~ N that can
        be divisible by 3, 5, and 15.
        if the number can be divisible by 3, 5 and
        15,
                then it should only be displayed in
        DivisibelBy15' section
        if the number can be divisible by 3 but
        cannot be divisible by 15,
                then it should only be displayed in
        DivisibelBy3' section
        if the number can be divisible by 5 but
        cannot be divisible by 15,
                then it should only be displayed in
        DivisibelBy5' section
        EX:*/
        Scanner in = new Scanner(System.in);
        int number= in.nextInt();
        String divisibleBy3="";
        String divisibleBy5="";
        String divisibleBy15="";

        for (int i = 0; i <= number; i++) {
            if (i%3==0 && i%5== 0){
                divisibleBy15+=i+" ";
            }
            else if (i%3==0 && i%5!= 0){
                divisibleBy3+=i+" ";
            }
            else if (i%3!=0 && i%5== 0){
                divisibleBy5+=i+" ";
            }

        }
        System.out.println("divisibleBy15 = " + divisibleBy15);
        System.out.println("divisibleBy5 = " + divisibleBy5);
        System.out.println("divisibleBy3 = " + divisibleBy3);

    }
}
