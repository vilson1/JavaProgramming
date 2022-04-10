package day25;

import java.util.Arrays;

public class AddElementsToArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int[] arr1=addIntiger(arr,5);
        System.out.println(Arrays.toString(arr1));

        double[] arrdouble={1.5,2.0,3.1,4.9};
        double[] arrdouble1=addDouble(arrdouble,5.5);
        System.out.println(Arrays.toString(arrdouble1));

        String[] arr3={"Vilson","Shehu","Ervisa","Amar"};
        String[] arr31=addString(arr3,"Shehu");
        System.out.println(Arrays.toString(arr31));




    }
    public static int[] addIntiger(int[] arr, int num){

        int[] arr2=new int[arr.length+1];

        int j=0;
        for (int i : arr) {
           arr2[j]=i;
           j++;
        }
        arr2[j]=num;

        return arr2 ;
    }
    public static double[] addDouble(double[] arr, double num){

        double[] arr2=new double[arr.length+1];

        int j=0;
        for (double i : arr) {
            arr2[j]=i;
            j++;
        }
        arr2[j]=num;

        return arr2 ;
    }
    public static char[] addChar(char[] arr, char num){

        char[] arr2=new char[arr.length+1];

        int j=0;
        for (char i : arr) {
            arr2[j]=i;
            j++;
        }
        arr2[j]=num;

        return arr2 ;
    }
    public static String[] addString(String[] arr, String num){

        String[] arr2=new String[arr.length+1];

        int j=0;
        for (String i : arr) {
            arr2[j]=i;
            j++;
        }
        arr2[j]=num;

        return arr2 ;
    }

}
