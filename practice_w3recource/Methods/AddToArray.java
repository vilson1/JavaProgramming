package Methods;

import java.util.Arrays;
import java.util.Scanner;

public class AddToArray {
    public static void add_to_r(int[] r,int n) {
        //create new array with one more position.

            int[] arr2= new int[r.length+1];
            for (int i = 0; i <r.length ; i++) {
                arr2[i]=r[i];

            }
            arr2[r.length]=n;
        System.out.println(Arrays.toString(arr2));

    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt(), n = inp.nextInt();
        int[] arr = new int[size];
        for(int i=0 ; i <=size-1; i++){
            arr[i]=inp.nextInt();
        }

        add_to_r(arr, n);

    }


}
