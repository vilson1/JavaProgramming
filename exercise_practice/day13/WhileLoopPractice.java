package day13;


import java.util.Scanner;

public class WhileLoopPractice {
    public static void main(String[] args) {

        //Write a program that can reverse any given string.

        Scanner in=new Scanner(System.in);
        String given= in.nextLine();
        String revers="";

        for (int i=given.length()-1; i>=0 ; i--)
        {
            String l=given.substring(i,i+1);
            revers=revers+l;

        }
        System.out.println(revers);


    }
}
