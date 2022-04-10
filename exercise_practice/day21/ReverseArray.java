package day21;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        //1. Write a program that sort the array of integer in descending order

        Scanner in = new Scanner(System.in);
        int size= in.nextInt();
        
        int[] arr=new int[size];
        for (int i = 0; i < size; i++) {
            arr[i]=in.nextInt();
            
        }

        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length/2; i++) {
            int temp;
            temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;

        }
        System.out.println(Arrays.toString(arr));
            

        
        
    }
}
