package arraysReplit;

import java.util.Arrays;
import java.util.Scanner;

public class CopyCertainValues {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] arr = {scan.next(),scan.next(),scan.next(),scan.next(),scan.next()};
        System.out.println(Arrays.toString(getWithE(arr)));

    }



    public static String[] getWithE(String[] arr) {

        //TODO : YOUR CODE GOES HERE ----------------------
           int count=0;
        for (String s : arr) {
            if (s.contains("e"))
                count++;

        }
        int j=0;
        String[] fewValues= new String[count];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains("e"))
            {
                fewValues[j]=arr[i];
                j++;
            }

        }

        //YOUR CODE ENDS HERE -----------------------

        return fewValues;
    }
}
