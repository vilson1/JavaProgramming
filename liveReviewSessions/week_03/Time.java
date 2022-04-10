package week_03;
import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         int hours, minutes, secondIn, second;

        System.out.println("Enter seconds! ");
        secondIn=in.nextInt();


        hours=secondIn/3600;
        minutes= (secondIn%3600)/60;
        second= (secondIn%3600)%60;
        System.out.println(hours+ "hours: "+ minutes + "minutes:"+ second+"second");

    }
}
