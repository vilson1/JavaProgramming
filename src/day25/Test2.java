package day25;

import utilities.ArraysUtility;

public class Test2 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        ArraysUtility.eachElement(arr);
        double[] arr2={1.0,3.2,4.5,2.9};
        ArraysUtility.eachElement(arr2);
        char[] arr3={'A','B','C'};
        ArraysUtility.eachElement(arr3);

        System.out.println(ArraysUtility.maxElement(arr));
        System.out.println(ArraysUtility.maxElement(arr2));
    }
}
