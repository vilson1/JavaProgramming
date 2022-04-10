package week09;

import java.util.Arrays;

public class BigestNumber {
    public static void main(String[] args) {
        //Find the bigest number in each array and put them in another array
        int [][] arr = { {3,12,3,34,12}, {13,7,456,34,3}, {-5, -24, -2, -10, -4} };
        
        int[] sortArray= new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int max=arr[i][0];
            for (int j = 0; j <arr[i].length ; j++) {
                if (arr[i][j]>max)
                    max=arr[i][j];
                
            }
            sortArray[i]=max;
            
        }
        System.out.println(Arrays.toString(sortArray));
        

        
    }
}
