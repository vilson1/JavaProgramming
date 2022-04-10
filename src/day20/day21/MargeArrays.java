package day20.day21;

import java.util.Arrays;

public class MargeArrays {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int[] arr2={7,8,9};

        int[] marge= new int[arr.length+arr2.length];
        int count=0;

        for (int i : arr) {
            marge[count]=i;
            count++;

        }
        for (int i : arr2) {
            marge[count]=i;
            count++;
        }
        System.out.println(Arrays.toString(marge));


        }
    }

