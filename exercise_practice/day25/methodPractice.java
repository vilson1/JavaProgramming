package day25;

import utilities.ArraysUtility;

import java.lang.reflect.Array;
import java.util.Arrays;

public class methodPractice {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int[] arr1={5,6,7,8,9};
         int[] arr2= merge(arr,arr1);
        System.out.println(Arrays.toString(arr2));
        System.out.println(max(arr));

    }
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

    public static double[] merge(double[] arr,double[] arr2){
        double[] mergearr=new double[arr.length+arr2.length];
        int j=0;
        for (double i : arr) {
            mergearr[j]=i;
            j++;
        }
        for (double i : arr2) {
            mergearr[j]=i;
            j++;
        }
        return mergearr;
    }

    public static char[] merge(char[] arr,char[] arr2){
        char[] mergearr=new char[arr.length+arr2.length];
        int j=0;
        for (char i : arr) {
            mergearr[j]=i;
            j++;
        }
        for (char i : arr2) {
            mergearr[j]=i;
            j++;
        }
        return mergearr;
    }

    public static String[] merge(String[] arr,String[] arr2){
        String[] mergearr=new String[arr.length+arr2.length];
        int j=0;
        for (String i : arr) {
            mergearr[j]=i;
            j++;
        }
        for (String i : arr2) {
            mergearr[j]=i;
            j++;
        }
        return mergearr;
    }


    public static int max(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

    public static long max(long[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

    public static short max(short[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

    public static float max(float[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

    public static byte max(byte[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }


    public static int minimum(int[] arr){
        Arrays.sort(arr);
        return arr[0];
    }

    public static double minimum(double[] arr){
        Arrays.sort(arr);
        return arr[0];
    }

    public static long minimum(long[] arr){
        Arrays.sort(arr);
        return arr[0];
    }

    public static short minimum(short[] arr){
        Arrays.sort(arr);
        return arr[0];
    }

    public static float minimum(float[] arr){
        Arrays.sort(arr);
        return arr[0];
    }

    public static byte minimum(byte[] arr){
        Arrays.sort(arr);
        return arr[0];
    }
}
