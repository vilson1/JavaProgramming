package day22;

import java.util.Arrays;

public class ArraysPractice {
    public static void main(String[] args) {
        //write a program that can split a sentence
        String setente="Today is a good day to learn Java";
        String[] words=setente.split(" ");
        System.out.println(Arrays.toString(words));

        String reverse="";

        for (int i = words.length-1; i>=0; i--) {
            reverse+=words[i]+" ";

        }
        System.out.println(reverse);
    }
}
