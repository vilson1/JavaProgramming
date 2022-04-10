package day18;

import java.util.Scanner;

public class Calculate2Numbers {
    public static void main(String[] args) {
       /* 3. Write a program that can calculate two numbers.
        1. Ask user to enter the first number
        2. Ask user to enter a math operator (+,-
                ,/,*)
        (if user enters any invalid operator,
                repeat this step until user provides a valid operator)
        3. Ask user to enter the second number
        4. Display the result
        5. Ask user if they want to continue?
        (yes/no)
        if yes ==> repeat the entire steps
        if no ==> print "Thanks for using Cydeo
        calculator!"
        If user enters any invalid entry,  ask
        the user to re-enter until user provides a valid entry*/

        Scanner in = new Scanner(System.in);

        char operator;
        double result;
        String str;
        while (true) {
            System.out.println("Enter first number");
            int num1= in.nextInt();


            while (true) {
                System.out.println("Enter operator");
                operator = in.next().charAt(0);
                if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
                    break;
                }
            }
            System.out.println("Enter second number");
            int num2 = in.nextInt();
            if (operator == '+') {
                result = num1 + num2;
            } else if (operator == '-') {
                result = num1 - num2;
            } else if (operator == '*') {
                result = num1 * num2;
            } else
                result = num1 / num2;
            System.out.println(result);

            while(true){

                System.out.println("Do you want to continue?");

                 str= in.nextLine().toLowerCase();
                 if (str.equals("yes")|| str.equals("no")){
                     break;
                 }
            }

            if (str.equals("no")){
                System.out.println("Thanks for using Cydeo calculator");
                break;
            }

        }


    }
}
