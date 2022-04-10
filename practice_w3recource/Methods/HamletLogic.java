package Methods;

import java.util.Scanner;

public class HamletLogic {
    public static boolean hamletQuote(boolean toBe,boolean notToBe){
        // your code here

        boolean result;
        if (toBe==true|| notToBe==true)
            result=true;
        else
            result=false;
        return result;



    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(hamletQuote(in.nextBoolean(), in.nextBoolean()));
    }
}
