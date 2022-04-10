package day20.day21;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1="acdb";
        String str2="dbca";

        char [] str3=str1.toCharArray();
        char [] str4=str2.toCharArray();

        System.out.println(Arrays.toString(str3));
        System.out.println(Arrays.toString(str4));
        Arrays.sort(str3);
        Arrays.sort(str4);
        if (Arrays.equals(str3,str4))
        {
            System.out.println("Strings are equal");
        }
        else
            System.out.println("Strings are not equals");



    }
}
