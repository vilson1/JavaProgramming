package Methods;

import java.util.Scanner;

public class SimpleRoomBooking {
    public static boolean simpleRoomBook(boolean isAvailable,int month, int day, int year){
        // your code here


        boolean result=true;

        if(year==2018) {
            if (isAvailable) {
                if (month == 7 && day > 0 && day < 9) {
                    result = !result;
                }
            }
            else
                result=!result;
        }

        else
            result=!result;


        return result;


    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(simpleRoomBook(in.nextBoolean(), in.nextInt(), in.nextInt(), in.nextInt()));

    }
}
