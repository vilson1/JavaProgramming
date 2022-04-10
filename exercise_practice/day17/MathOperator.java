package day17;

import java.util.Scanner;

public class MathOperator {
    public static void main(String[] args) {

        /*    3. write a program to ask user to enter two number and math operator,
    and return the result.
            if the operator is invalid operator, ask user to re-enter
    the operator until user provides a valid operator (+, -, *, /)*/


        Scanner in=new Scanner(System.in);

        int num1= in.nextInt();
        int num2= in.nextInt();
        char operator;
        double result;
        while (true){
            System.out.println("Enter Operator!");
             operator=in.next().charAt(0);
            if (operator=='+' || operator=='-'||operator=='*'||operator=='/')
                break;
        }

        if (operator=='+'){
            result=num1+num2;
        }
        else if (operator=='-'){
            result=num1-num2;
        }
        else if (operator=='*'){
            result=num1*num2;
        }
        else
            result=num1/num2;
        System.out.println(result);


    }




}
