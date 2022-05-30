package day27;

import java.util.Scanner;

public class CountUpperAndLower {
   /* 4. Write program that returns true if the total number of upper case
    characters are equal to total number of Lowercase characters of a
            string*/

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("Enter a string");
        String str= in.nextLine();

        char[] arr=str.toCharArray();

        int upperCase=0;
        int lowerCase=0;

        for (char each : arr) {
            if  (each>=65 && each<=90 ){
                upperCase++;
            }
             if (each>=97 && each<=122){
                lowerCase++;
            }


        }
        if (upperCase==lowerCase){
            System.out.println(true);
        }
        else System.out.println(false);
    }

}
