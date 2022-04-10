package arraysReplit;

import java.util.Scanner;

public class Printing03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[6];
        for (int i=0;i<6;i++)
        {
            arr[i] = input.nextLine();
        }
        // DO NOT TOUCH ABOVE
        for (int j = 0; j < 4; j++) {
            System.out.println(arr[j]+", "+arr[j+1]+", "+arr[j+2]);


        }
    }
}
