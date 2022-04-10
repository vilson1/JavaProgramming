package day21;

import java.util.Scanner;

public class CountPalindromes {
    public static void main(String[] args) {
        //4. write a program that can count how many palindromes in an array of string
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        String[] arr = new String[size];


        for (int i = 0; i < size; i++) {
            arr[i]=in.next();

        }

        int count =0;
        for (String s : arr) {

            String inverse="";
            for (int i = s.length()-1; i >=0 ; i--) {
                inverse+=s.charAt(i);
                if (inverse.equals(s))
                    count++;


            }

        }
        System.out.println(count);
    }
}
