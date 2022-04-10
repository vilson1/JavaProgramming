package day27;

import utilities.ArraysUtility;

import java.util.Arrays;

public class RemoveDublicates {

    //Remove dublicated elements of the array.
    public static int[] removeDublicates(int[] arr){
        int[] result={};
        for (int i : arr) {
            if (!ArraysUtility.contains(result,i)){
                result=ArraysUtility.addElement(result,i);
            }

        }
        return result;
    }

    //Remove dublicated elements of the array.
    public static double[] removeDublicates(double[] arr){
        double[] result={};
        for (double i : arr) {
            if (!ArraysUtility.contains(result,i)){
                result=ArraysUtility.addElement(result,i);
            }

        }
        return result;
    }

    //Remove dublicated elements of the array.
    public static char[] removeDublicates(char[] arr){
        char[] result={};
        for (char i : arr) {
            if (!ArraysUtility.contains(result,i)){
                result=ArraysUtility.addElement(result,i);
            }

        }
        return result;
    }

    //Remove dublicated elements of the array.
    public static String[] removeDublicates(String[] arr){
        String[] result={};
        for (String i : arr) {
            if (!ArraysUtility.contains(result,i)){
                result=ArraysUtility.addElement(result,i);
            }

        }
        return result;
    }
}
