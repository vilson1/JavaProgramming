package arraysReplit;

import java.util.Arrays;
import java.util.Scanner;

public class PrintShortestWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        String[] strArray=str.split(", ");

        String shortWord="";
        int wordlength=strArray[0].length();

        for (String s : strArray) {
            if (wordlength<s.length())
            {
                shortWord+=s+" ";
            }

        }
        String[] strArray2=shortWord.split(" ");
        System.out.println(Arrays.toString(strArray2));

    }
}
