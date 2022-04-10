package Methods;

import java.util.Scanner;

public class PrintNext3Numbers {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("enter number");
        int num = inp.nextInt();
        print3Numbers(num);


    }
    public static void print3Numbers(int num){
        String print="";
        for (int i = num+1; i <=num+3 ; i++) {
            print+=i+" ";

        }
        System.out.println("next 3 are:");
        print=print.substring(0,print.length()-1);
        System.out.println(print);
    }
}
