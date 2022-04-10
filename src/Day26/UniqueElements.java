package Day26;

import utilities.ArraysUtility;

import java.util.Arrays;


public class UniqueElements {
    public static void main(String[] args) {
        int[] arr={2,2,3,4,4,5,6,6,6,};
        System.out.println(Arrays.toString(uniqueElement(arr)));
    }
    //Returns unique elements of an Array in a new Array
    public static int[] uniqueElement(int[] arr){
        int[] result={};
        for (int i : arr) {
            if (ArraysUtility.frequencyOfElement(arr,i)==1){
                result=ArraysUtility.addElement(result,i);
            }

        }
        return result;
    }

    //Returns unique elements of an Array in a new Array
    public static double[] uniqueElement(double[] arr){
        double[] result={};
        for (double i : arr) {
            if (ArraysUtility.frequencyOfElement(arr,i)==1){
                result=ArraysUtility.addElement(arr,i);
            }

        }
        return result;
    }

    //Returns unique elements of an Array in a new Array
    public static char[] uniqueElement(char[] arr){
        char[] result={};
        for (char i : arr) {
            if (ArraysUtility.frequencyOfElement(arr,i)==1){
                result=ArraysUtility.addElement(result,i);
            }

        }
        return result;
    }

    //Returns unique elements of an Array in a new Array
    public static String[] uniqueElement(String[] arr){
        String[] result={};
        for (String i : arr) {
            if (ArraysUtility.frequencyOfElement(arr,i)==1){
                result=ArraysUtility.addElement(result,i);
            }

        }
        return result;
    }
}
