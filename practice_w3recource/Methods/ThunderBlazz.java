package Methods;

import java.util.Scanner;

public class ThunderBlazz {
    public static boolean getThunderBlazz(boolean available,boolean gift, int ingredient1
            , int ingredient2, int ingredient3){

        // your code here
        boolean result=true;
        int sumOfIngridients=ingredient1+ingredient2+ingredient3;
        if (available || gift || sumOfIngridients==6){
            result=result;
        }
        else
            result=!result;

        return result;


    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(getThunderBlazz(in.nextBoolean(), in.nextBoolean(), in.nextInt(), in.nextInt(), in.nextInt()));
    }
}
