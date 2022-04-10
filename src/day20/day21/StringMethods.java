package day20.day21;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String str="Java";
        char[] chars=str.toCharArray();
        System.out.println(Arrays.toString(chars));

        for (char each:str.toCharArray())
        {
            System.out.println(each);
        }

        String str1="Wooden Spoon";
        String[] spleted=str1.split(" ");
        System.out.println(Arrays.toString(spleted));
    }
}
