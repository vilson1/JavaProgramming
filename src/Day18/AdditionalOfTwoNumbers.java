package Day18;

import java.util.Scanner;

public class AdditionalOfTwoNumbers {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        while (true)
        {
            System.out.println("Enter your first number");
            int num1=in.nextInt();
            System.out.println("Enter your second number");
            int num2=in.nextInt();

            System.out.println("Addition = "+(num1+num2));
            System.out.println("Would you like to continue?");
            String a= in.next();


        }


    }
}
