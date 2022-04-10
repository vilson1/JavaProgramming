package day13;

import java.util.Scanner;

public class FirstLetter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 2 words");
        String w1=in.next();
        String w2=in.next();

        String w=w1.substring(1)+w2.substring(1);
        System.out.println(w);
    }
}
