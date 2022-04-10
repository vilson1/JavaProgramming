package arraysReplit;

import java.util.Arrays;
import java.util.Scanner;

public class PrintFirstAndLAstChar {
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};


            //TODO: Write your code below

        String[] firsLastChar= new String[words.length];
        int i=0;
            for (String word : words) {
                firsLastChar[i]=""+word.charAt(0)+word.charAt(word.length()-1);
                i++;

        }
        System.out.println(Arrays.toString(firsLastChar));


    }
}
