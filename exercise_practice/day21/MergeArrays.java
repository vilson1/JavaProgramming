package day21;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArrays {

    public static void main(String[] args) {
        //5. Write a program that can merge 3 arrays of integers
        Scanner in = new Scanner(System.in);
        System.out.println("Array 1");
        int size = in.nextInt();
        System.out.println("Array 2");
        int size1 = in.nextInt();
        System.out.println("Array 3");
        int size2 = in.nextInt();


        int[] arr = new int[size];
        int[] arr1 = new int[size1];
        int[] arr2 = new int[size2];

        for (int i = 0; i < size; i++) {
            arr[i]=in.nextInt();

        }


        for (int i = 0; i < size; i++) {
            arr1[i]=in.nextInt();

        }

        for (int i = 0; i < size; i++) {
            arr2[i]=in.nextInt();

        }

        int[] margedArr=new int[size+size1+size2];
        int count=0;
        for (int i : arr) {
            margedArr[count]=i;
            count++;

        }
        for (int i : arr1) {
            margedArr[count]=i;
            count++;

        }
        for (int i : arr2) {
            margedArr[count]=i;
            count++;
        }
        System.out.println(Arrays.toString(margedArr));
    }
}
