package week09;

import java.util.Arrays;

public class Arrays_BinarySearchExample {
    public static void main(String[] args) {
        int[] num={-5,23,123,654,2366,144221};
        int index1= Arrays.binarySearch(num,23);
        System.out.println(index1);
    }
}
