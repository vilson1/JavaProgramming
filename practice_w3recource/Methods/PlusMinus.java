package Methods;

import java.util.Scanner;

public class PlusMinus {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i <= size - 1; i++) {
            arr[i] = inp.nextInt();
        }

        plus_minus(arr);
    }

    public static void plus_minus(int[] arr) {
        int countPositive = 0, countZero = 0, countNegative = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0)
                countPositive++;
            else if (arr[i] == 0)
                countZero++;
            else
                countNegative++;

        }
        String output="positives: "+countPositive+", negatives: "+countNegative+", Zeros: "+countZero;
        System.out.println(output);


    }
}
