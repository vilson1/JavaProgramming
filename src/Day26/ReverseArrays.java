package Day26;

import utilities.ArraysUtility;

public class ReverseArrays {

    //Reverse the given Array and returns the Array.
    public static int[] reverseArray(int[] arr){
        int[] result={};
        for (int i = arr.length-1; i >=0; i--) {
            result= ArraysUtility.addElement(result,arr[i]);

        }
        return result;
    }

    //Reverse the given Array and returns the Array.
    public static double[] reverseArray(double[] arr){
        double[] result={};
        for (int i = arr.length-1; i >=0; i--) {
            result= ArraysUtility.addElement(result,arr[i]);

        }
        return result;
    }

    //Reverse the given Array and returns the Array.
    public static char[] reverseArray(char[] arr){
        char[] result={};
        for (int i = arr.length-1; i >=0; i--) {
            result= ArraysUtility.addElement(result,arr[i]);

        }
        return result;
    }

    //Reverse the given Array and returns the Array.
    public static String[] reverseArray(String[] arr){
        String[] result={};
        for (int i = arr.length-1; i >=0; i--) {
            result= ArraysUtility.addElement(result,arr[i]);

        }
        return result;
    }
}
