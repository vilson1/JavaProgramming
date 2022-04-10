package day18;

import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        /*4. Write a program that can find the frequency of the characters from a
                string*/
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
            if (!result.contains(""+str.charAt(i))){
                result+=""+count+str.charAt(i);
            }
            count=0;

        }
        System.out.println(result);
    }
}
