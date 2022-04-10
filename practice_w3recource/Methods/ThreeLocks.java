package Methods;

import java.util.Scanner;

public class ThreeLocks {
    public static boolean threeLocks(boolean a, boolean b, boolean c) {
        Boolean print;
        if(a==true && b==true || c==true)
        {
            print=true;
        }
        else
            print=false;

        return print;

    }//end threeLocks

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(threeLocks(in.nextBoolean(), in.nextBoolean(),in.nextBoolean()));

    }
}
