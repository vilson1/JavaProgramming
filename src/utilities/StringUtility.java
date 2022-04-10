package utilities;

import java.util.Arrays;

public class StringUtility {

    //Prints each character of a String
    public static void printEachChar(String str){
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));

        }
    }

    // reverse the given string and return the reversed string.
    public static String reverse(String str){
        String reversed="";
        for (int i = str.length()-1; i >=0; i--) {
            reversed+=str.charAt(i);

        }
        return  reversed;
    }

     // turns boolian if the string is palindrome.
    public static boolean isPalindrome(String str){
        return reverse(str).equalsIgnoreCase(str);
    }

    // checks if 2 strings are anagram.
    public static boolean isAnagram(String str1, String str2){
        char[] ch1=str1.toCharArray();
        char[] ch2=str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        return Arrays.equals(ch1,ch2);
    }

    //Remove dublicates from given String.
    public static String removeDublicates(String str){
        String result="";
        for (int i = 0; i < str.length(); i++) {
            char each=str.charAt(i);
            if (!result.contains(""+each)){
                result+=each;
            }

        }
        return result;
    }
}
