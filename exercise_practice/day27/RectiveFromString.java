package day27;

import java.util.Scanner;

public class RectiveFromString {
 /*   3. Write a program that can retrieve the letters, digits and special
    characters from the string
    Ex:
    str = "Wooden Spoon!"
    output:
    letters= "WoodenSpoon";
    Digits = "";
    specialChars = " !";*/
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("Enter a string");
        String str= in.nextLine();

        String letters="";
        String digits="";
        String specialChar="";

        char[] arr= str.toCharArray();

        for (char each : arr) {
            if (each>=65 && each<=90 || each>=97 && each<=122){
                letters+=each;
            }
            else if (each>=48 && each<=57){
                digits+=each;
            }
            else specialChar+=each;

        }
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialChar = " + specialChar);



    }
}
