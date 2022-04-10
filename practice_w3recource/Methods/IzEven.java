package Methods;

import java.util.Scanner;

public class IzEven {
    public static boolean isEven(int n) {
        boolean result;
        if (n%2==0)
            result=true;
        else
            result=false;
        return result;

    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(isEven(in.nextInt()));
    }
}
