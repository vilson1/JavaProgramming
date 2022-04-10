package Methods;

import java.util.Scanner;

public class RemoveDublicated {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(uniqueChars(in.next()));
    }

    public static String uniqueChars(String str) {
        //TODO: write your code

        String result="";
        char[] arr=str.toCharArray();
        for (char each : arr) {

            if (!result.contains(""+each)){
                result+=""+each;

            }

        }

        return result;

    }
}
