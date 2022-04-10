package Methods;

import java.util.Arrays;
import java.util.Scanner;

public class CountLeters {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(countLetters(in.next()));
    }

    public static String countLetters(String str){

        String result="";

      char[] arr=  str.toCharArray();

        for (char each : arr) {
            int count=0;
            for (char c1 : arr) {
                if (each==c1){
                    count++;
                }

            }
            if (!result.contains(""+each)){
                result+=""+count+each;
            }
            count=0;

        }


        return result;
    }
}
