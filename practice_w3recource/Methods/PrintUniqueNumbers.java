package Methods;

import java.util.Scanner;

public class PrintUniqueNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] nums = new int[size];
        for(int i=0; i < size; i++){
            nums[i] = scan.nextInt();
        }
        printUniqueNumbers(nums);
    }

    public static void printUniqueNumbers(int[] nums){
        //WRITE YOUR CODE HERE
        String dublicated="";
        int count=0;
        for (int i = 0; i < nums.length; i++) {

            for (int num : nums) {
                if (nums[i]==num)

                count++;
            }
            if (count==1)
                dublicated+=nums[i]+",";
            count=0;

        }
        String[] arr1=dublicated.split(",");
        for (String s : arr1) {
            System.out.println(s);

        }

    }
}
