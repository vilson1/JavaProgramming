package Day26;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(removeElement(arr,6)));
    }

    //Return a new Array after removing indexed element
    public static int[] removeElement(int[] arr, int index){
        if (index<0 || index>arr.length-1)
        {
            System.err.println("Invalid Index"+ index);
            System.exit(0);
        }
        int[] result=new int[arr.length-1];


        int j=0;
        for (int i=0 ; i<arr.length; i++) {
            if (i==index)
            {
                continue;
            }
            result[j]=arr[i];
            j++;


            
        }
        return result;
    }

    //Return a new Array after removing indexed element
    public static double[] removeElement(double[] arr, double index){
        if (index<0 || index>arr.length-1)
        {
            System.err.println("Invalid Index"+ index);
            System.exit(0);
        }
        double[] result=new double[arr.length-1];



        for (int i=0 ,j=0; i<arr.length; i++,j++) {
            if (i==index)
            {
                continue;
            }
            result[j]=arr[i];




        }
        return result;
    }

    //Return a new Array after removing indexed element
    public static char[] removeElement(char[] arr, char index){
        if (index<0 || index>arr.length-1)
        {
            System.err.println("Invalid Index"+ index);
            System.exit(0);
        }
        char[] result=new char[arr.length-1];


        int j=0;
        for (int i=0 ; i<arr.length; i++) {
            if (i==index)
            {
                continue;
            }
            result[j]=arr[i];
            j++;



        }
        return result;
    }

    //Return a new Array after removing indexed element
    public static String[] removeElement(String[] arr, int index){
        if (index<0 || index>arr.length-1)
        {
            System.err.println("Invalid Index"+ index);
            System.exit(0);
        }
        String[] result=new String[arr.length-1];


        int j=0;
        for (int i=0 ; i<arr.length; i++) {
            if (i==index)
            {
                continue;
            }
            result[j]=arr[i];
            j++;



        }
        return result;
    }
}
