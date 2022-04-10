package Methods;

import java.util.Scanner;

public class Signum {

    public static void sign(int n){
        //your code here

        String s=(n<0)? "negative": (n>0)? "positive":"zero";
        System.out.println(s);

    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();

        sign(n);

    }
}
