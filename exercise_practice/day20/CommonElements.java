package day20;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter length and elements of first Array");
        int arrlength= in.nextInt();

        int[] arr=new int[arrlength];
        for (int i = 0; i < arrlength; i++) {
            arr[i]=in.nextInt();
        }
        System.out.println("Enter length and elements of second Array");


        int arrlength2= in.nextInt();
        int[] arr2=new int[arrlength2];
        for (int i = 0; i < arrlength2; i++) {
            arr2[i]=in.nextInt();
        }
        String result="";
        for (int a1 : arr) {
            for (int a2 : arr2) {
                if (a1==a2){
                    result+=a1+" ";
                }
            }

        }
        System.out.println(result);
    }
}
