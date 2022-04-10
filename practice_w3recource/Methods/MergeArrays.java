package Methods;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArrays {
    public static int[] mergR(int[] a,int[] b) {

        int[] arr=new int[a.length+b.length];
        int i=0;
        for (int each : a) {
            arr[i]=each;
            i++;

        }
        for (int each : b) {
            arr[i]=each;
            i++;
        }
        return arr;








    }//end mergR

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] nums = new int[in.nextInt()];
        int [] nums2 = new int[in.nextInt()];
        for(int i=0; i < nums.length; i++) {
            nums[i] = in.nextInt();
        }
        for(int i=0; i < nums2.length; i++) {
            nums2[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(mergR(nums, nums2)));

    }
}
