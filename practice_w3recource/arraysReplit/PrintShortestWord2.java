package arraysReplit;

import java.util.Arrays;
import java.util.Scanner;

public class PrintShortestWord2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();


        String[] strArray=str.split(", ");

        String shortWord="";

        System.out.println(Arrays.toString(strArray));


        for (String s : strArray) {
            for (int j = 0; j >str.length() ; j++) {
                if (s.length()>strArray[j].length())
                {
                    shortWord=strArray[j];
                }
            }

        }
        System.out.println(shortWord);

    }
}
