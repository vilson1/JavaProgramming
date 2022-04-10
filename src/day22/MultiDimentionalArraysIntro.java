package day22;

import java.util.Arrays;

public class MultiDimentionalArraysIntro {
    public static void main(String[] args) {

        String[] group1={"John","Jones", "James"};
        String[] group2={"John","Jones", "James"};
        String[] group3={"John","Jones", "James"};

        String[][] groups=new String[3][];
        groups[0]=group1;
        groups[1]=group2;
        groups[2]=group3;

        System.out.println(Arrays.deepToString(groups));
        System.out.println("======================================");

        int[][] nums={{1,2,3},{4,5,6,7},{8,9,10,11,12}};
        System.out.println(Arrays.deepToString(nums));
        System.out.println("============");

        for (int[] num : nums) {
            System.out.println(Arrays.deepToString(nums));

        }
    }
}
