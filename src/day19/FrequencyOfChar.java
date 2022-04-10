package day19;

import java.util.Scanner;

public class FrequencyOfChar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word");
        String word=in.next();

        String rep="";
        int count=0;

        for (int i = 0; i < word.length(); i++) {
            rep=word.charAt(i)+"";
            for (int j = 0; j < word.length(); j++) {

                word.replaceFirst(word.charAt(j)+"","");

                        count++;

            }
            System.out.println(rep+count);



        }
    }
}
