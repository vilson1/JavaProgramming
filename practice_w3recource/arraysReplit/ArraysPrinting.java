package arraysReplit;

import java.util.Scanner;

public class ArraysPrinting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i=0;i<5;i++)
        {
            arr[i] = input.nextLine();
        }
        for (int j = 0; j < 5; j++) {
            System.out.println(arr[j].substring(0,3));

        }




    }
}
