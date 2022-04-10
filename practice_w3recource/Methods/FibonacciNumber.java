package Methods;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        fib(num);
    }

    public static void fib(int num){
        //WRITE YOUR CODE HERE

        int fibonacciNumb=0;
        int number2=1;
        int number1=0;
        for (int i = 1; i < num; i++) {


            fibonacciNumb=number1+number2;
            number1=number2;
            number2=fibonacciNumb;
            
        }
        if (num==1)
            fibonacciNumb=1;
            System.out.println();
        System.out.println(fibonacciNumb);





    }
}
