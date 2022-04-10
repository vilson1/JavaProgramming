package arraysReplit;

import java.util.Scanner;

public class MaximumStringLengthInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for(int i = 0; i < 5;  i++) {

            words[i] = input.nextLine();

        }

        //write your code below
        String print="";
        for (int i = 0; i < 5; i++) {

            for (String word : words) {
                if (words[i].length()<word.length())
                    print=word;

            }

        }
        System.out.println(print);

    }
}
