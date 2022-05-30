package day27;

import java.util.ArrayList;
import java.util.Arrays;

public class SwapTask {
  /*  2. Swap Task:
            2.1 Create a method named swap that passes three parameters: integer
    array, integer i, integer j. the method swaps the element at index i with
    the element at index j, and returns the new array
    Ex:
    arr = {10, 20, 30, 40, 50};
    swap(arr, 2, 4) ==>  {10, 20, 50, 40,
            30}*/

    public static Integer[] swap(Integer[] arr, int i, int j){
        int a;
        int b;
        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(arr));

        a=list.get(i);
        b=list.get(j);
        list.set(j,a);
        list.set(i,b);

        arr=list.toArray(new Integer[0]);
        return arr;

    }

    public static void main(String[] args) {
        Integer[] arr={10,20,30,40,50};
        System.out.println(Arrays.toString(swap(arr,0,4)));
    }
}
