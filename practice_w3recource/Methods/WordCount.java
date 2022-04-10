package Methods;

import java.util.Arrays;
import java.util.Scanner;

public class WordCount {
    public static int wordCount(String words) {
        // your code

        String[] arr=words.split(" ");
        int count=0;
        for (String s : arr) {
            count++;
        }

        return count;

    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(wordCount(in.nextLine()));
    }
}
