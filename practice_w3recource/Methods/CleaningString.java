package Methods;

import java.util.Scanner;

public class CleaningString {
    public static String clean (String text ,String badWord) {

        String str=text.replace(badWord,"").trim().replace("  "," ");
        return str;


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(clean(in.nextLine(), in.nextLine()));
    }
}
