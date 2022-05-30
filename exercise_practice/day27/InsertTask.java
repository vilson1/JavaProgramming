package day27;

import java.util.ArrayList;
import java.util.Arrays;

public class InsertTask {
//    1. Insert Task:
//     1.1 Create a method named insert that passes three
//    parameters: integer array, integer index, integer element. the method
//    inserts the given element to the given index of the array and returns the
//    new array
//    Ex:
//    arr = {10, 20, 30, 40, 50};
//    insert(arr, 2, 100) ==> {10,
//            20, 100, 30, 40, 50}
//    1.2 Create the same function for double array, char array
//    and string array

    public static Integer[] insertTask(Integer[] arr, int index, int element ){
        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays .asList((arr)));
        list.add(index,element);
        arr=list.toArray(new Integer[0]);
        return arr;
    }

    public static void main(String[] args) {
        Integer[] arr={10,20,30,40,50};
        Integer[] arr2=insertTask(arr,2,100);
        System.out.println(Arrays.toString(arr2));

    }

}
