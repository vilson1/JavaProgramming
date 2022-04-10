package Day18;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true)
        {
            System.out.println("Enter a number!");
            int num = in.nextInt();
            if (num%2==0)
            {
                System.out.println("Even number");
            }
            else
            {
                System.out.println("Odd number");
            }
            System.out.println("Would you like to continue?");
            String s= in.next();
            s.toUpperCase();
            while (!(s.toUpperCase().equals("NO")||s.toUpperCase().equals("YES")))
            {
                System.err.println("Invalid entry");
                System.out.println("Would you like to continue?");
                 s= in.next();


            }
            if (s.toUpperCase().equals("NO"))
            {
                break;
            }


        }


    }
}
