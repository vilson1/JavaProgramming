package Methods;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        plus();
    }
    public static void plus(){

        //your code here

        Scanner in=new Scanner(System.in);
        System.out.println("enter first number:");
        int  num1 = in.nextInt();
        System.out.println("enter second number");
        int num2= in.nextInt();
        int result=num1+num2;
        System.out.println("result :"+result);





    }
}
