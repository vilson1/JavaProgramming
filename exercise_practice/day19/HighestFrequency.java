package day19;

import java.util.Scanner;

public class HighestFrequency {
    public static void main(String[] args) {
        /*6.  Write a program that can find the character that has the highest
        frequency from a string*/

        Scanner in =new Scanner(System.in);
        String str= in.next();
        int highestfreq=0;
        char ch=' ';

        for (int i = 0; i <str.length() ; i++) {
            int frequency=0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i)==str.charAt(j)){
                    frequency++;

                }

            }
            if (highestfreq<frequency)
            {
                highestfreq=frequency;
                ch=str.charAt(i);
            }

            frequency=0;

        }
        System.out.println(ch);
    }
}
