package Methods;

import java.util.Scanner;

public class FindErrorString {
    public static boolean isError(String line) {

        boolean result=false;

        if (line.substring(0,5).equals("error"))
            result=!result;

        return result;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isError(in.nextLine()));
    }
}
