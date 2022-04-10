package day20.day21;

import java.util.Arrays;

public class ReverseArrays {
    public static void main(String[] args) {
        int[] num={10,20,30,40,50};
        int[] reversed=new int[num.length];
        for (int i = num.length-1, j=0; i >=0 ; i--,j++) {
            reversed[j]=num[i];

        }
        System.out.println(Arrays.toString(reversed));
    }
}
