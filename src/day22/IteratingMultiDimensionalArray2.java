package day22;

public class IteratingMultiDimensionalArray2 {
    public static void main(String[] args) {
        int[][] nums={{1,2,3},{4,5,6,7,8},{9,10,11,12,13}};

        for (int i = nums.length-1; i >=0 ; i--) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j]+" ");

            }
            System.out.println();

        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
        for (int i = nums.length-1; i >=0 ; i--) {
            for (int j = nums[i].length-1; j >=0 ; j--) {
                System.out.print(nums[i][j]+" ");

            }
            System.out.println();


        }
    }
}
