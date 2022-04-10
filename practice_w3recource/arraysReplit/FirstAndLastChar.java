package arraysReplit;

import java.util.Scanner;

public class FirstAndLastChar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};

        // leave above code alone :)
        // assume you have String array of 5 items
        //and print first and last char of each items in one line

        //TODO: Write your code below

        for (int i = 0; i < 5; i++) {
            System.out.println(words[i].substring(0,1)+words[i].substring(words[i].length()-1));

        }

    }
}
