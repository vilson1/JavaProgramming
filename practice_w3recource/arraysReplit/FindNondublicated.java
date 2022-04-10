package arraysReplit;

import java.util.Scanner;

public class FindNondublicated {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),
                input.nextInt(),input.nextInt(),input.nextInt()};

        for (int i = 0; i < nums.length; i++) {
            int count=0;

            for (int num : nums) {
                if (nums[i]==num)
                    count++;

            }
            if (count==1)
                System.out.println(nums[i]);

        }


    }
}
