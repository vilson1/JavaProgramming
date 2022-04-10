package day17;

import java.util.Scanner;

public class RemoveDublicates {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String");
        String s= in.next();

        String r="";

        for (int i = 0; i < s.length(); i++) {
            if (r.contains(s.substring(i,i+1)))
            {
                continue;
            }
            r=r+s.substring(i,i+1);

        }
        System.out.println(r);



    }
}
