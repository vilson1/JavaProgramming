package day13;

import java.util.Scanner;

public class XWord {
    public static void main(String[] args) {

     /*   3. Ask user to enter a word. If the work starts with x, print the
        word without x.
                */
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a word");
        String w = in.next();

        if (w.charAt(0)=='x')
            System.out.println(w.substring(1));
        else
            System.out.println(w);
    }
}
