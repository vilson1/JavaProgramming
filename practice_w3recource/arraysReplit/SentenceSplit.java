package arraysReplit;

import java.util.Scanner;

public class SentenceSplit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        //type your code below
        String[] sentenceArr= sentence.split(" ");
        for (String s : sentenceArr) {
            System.out.println(s);

        }
    }
}
