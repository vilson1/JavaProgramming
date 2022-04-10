package Day26;

import utilities.ArraysUtility;


public class MergeArrays {

    //Merge two arrays and return a new array.
    public static int[] merge(int[] arr,int[] arr2){
        int[] result= {};

        for (int i : arr) {
            result= ArraysUtility.addElement(result,i);
        }
        for (int i : arr2) {
            result= ArraysUtility.addElement(result,i);

        }
        return result;
    }

    //Merge two arrays and return a new array.
    public static double[] merge(double[] arr,double[] arr2){
        double[] result= {};

        for (double i : arr) {
            result= ArraysUtility.addElement(result,i);
        }
        for (double i : arr2) {
            result= ArraysUtility.addElement(result,i);

        }
        return result;
    }

    //Merge two arrays and return a new array.
    public static char[] merge(char[] arr,char[] arr2){
        char[] result= {};

        for (char i : arr) {
            result= ArraysUtility.addElement(result,i);
        }
        for (char i : arr2) {
            result= ArraysUtility.addElement(result,i);

        }
        return result;
    }

    //Merge two arrays and return a new array.
    public static String[] merge(String[] arr,String[] arr2){
        String[] result= {};

        for (String i : arr) {
            result= ArraysUtility.addElement(result,i);
        }
        for (String i : arr2) {
            result= ArraysUtility.addElement(result,i);

        }
        return result;
    }
}
