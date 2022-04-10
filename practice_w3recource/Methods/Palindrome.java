package Methods;

import java.util.Locale;
import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(String check) {

        // your code here

        check=check.toLowerCase().replace(" ","");
        boolean result=false;
        String inverse="";
        for (int i = check.length()-1; i >=0 ; i--) {
            inverse+=""+check.charAt(i);

        }
        if (inverse.equals(check)){
            result=true;
        }
        return result;





    }


    // Do not touch below

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isPalindrome(in.nextLine()));
    }
}
