package loopsReplit;

import java.util.Scanner;

public class PrintAsteriks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        //WRITE YOUR CODE HERE
        while (n>0)
        {
            System.out.print("*");
            n--;
        }
    }
}
