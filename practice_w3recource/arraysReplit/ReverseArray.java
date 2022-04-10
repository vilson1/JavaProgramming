package arraysReplit;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        //TODO: write your code below

        for (int i = 0; i < 4; i++) {
            int temp=nums[i];
             nums[i]=nums[6-i];
             nums[6-i]=temp;

        }

        //Do not change below statement:
        System.out.println(Arrays.toString(nums));
    }
}
