package Methods;
import utilities.ArraysUtility;

import java.util.Arrays;
import java.util.Scanner;

public class MethodOverloading {


        // Write your code here

        public static int findMax(int[] arr) {

            Arrays.sort(arr);
            int max = arr[arr.length - 1];
            return max;
        }

        public static double findMax(double[] arr) {

            Arrays.sort(arr);
            double max = arr[arr.length - 1];
            return max;
        }



// DO NOT TOUCH THE MAIN METHOD

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        boolean runInt = in.nextBoolean();
        int size = in.nextInt();

        if (runInt) {
            int[] arr = new int[size];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = in.nextInt();
            }
            System.out.println(findMax(arr));
        } else if (!runInt){
            double[] arr = new double[size];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = in.nextInt();
            }
            System.out.println(findMax(arr));
        }



    }

}
