package day18;

import java.util.Scanner;

public class UniqueChar {
    public static void main(String[] args) {

      /*  Write a program that can find the unique characters from a string
        without using index() and lastIndexOf() methods*/
        Scanner in = new Scanner(System.in);
        String str= in.next();
        String result="";

        for (int i = 0; i < str.length(); i++) {
            int count=0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i)==str.charAt(j)){
                    count++;

                }

            }
            if (count==1){
                result+=""+str.charAt(i);
            }


        }
        System.out.println(result);
    }
}
