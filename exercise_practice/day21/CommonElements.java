package day21;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {

     /*   3. Write a program that can print out the common elements from two
        integer array
        Ex:
        arr1: {1,2,3,4,5}
        arr2: {4,5,6,7,8}
        output:
        4 5*/
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] arr = new int[size];
        int[] arr1 = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i]=in.nextInt();

        }
        for (int i = 0; i < size; i++) {
            arr1[i]=in.nextInt();

        }
        int count=0;
        String result="";
        for (int each1 : arr) {
            for (int each2 : arr1) {
                if (each1==each2)
                    count++;

            }
            if (count>=1 && !result.contains(each1+"")) {
                result+=each1+" ";
            }
            count=0;

        }
        System.out.println(result);
    }
}
