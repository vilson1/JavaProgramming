package day22;

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {
        int[][] nums={{1,2,3},{4,5,6,7,8},{9,10,11,12,13}};

        for (int[] num : nums) {
            System.out.println(Arrays.toString(num));
            for (int i : num) {
                System.out.print(i);

            }
            
        }
    }
}
