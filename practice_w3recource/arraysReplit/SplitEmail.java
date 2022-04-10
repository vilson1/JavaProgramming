package arraysReplit;

import java.util.Scanner;

public class SplitEmail {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String email = input.nextLine();

        //Write your code below
        int count=0;

        for (int i = 0; i < email.length(); i++) {
            if (email.charAt(i)=='@')
                count++;

        }
        if (count==1)
        {
            String[] splitEmail=email.split("@");
            System.out.println("Email id: "+splitEmail[0]);
            System.out.println("Email domain: "+splitEmail[1]);
        }
        else
            System.err.println("invalid email");


    }
}
