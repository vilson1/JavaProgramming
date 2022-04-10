package Methods;

import java.util.Scanner;

public class ProfitOrLoss {
    public static String profits(int buyPrice,int sellPrice){
        //your code here


        return ((buyPrice>sellPrice)? "loss": (buyPrice==sellPrice)? "no loss": "profit");



    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(profits(in.nextInt(), in.nextInt()));
    }
}
