package day29;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArrayAndArrayList {
    public static void main(String[] args) {


        int[] arr={1,2,3,4,5,6,7,8,9};
        int[] arr1=new int[arr.length];

        for (int i = arr.length - 1, j=0; i >= 0; i--,j++) {
            arr1[j]=arr[i];

        }

        System.out.println(Arrays.toString(arr1));

        System.out.println("------------------------------------");


        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        ArrayList<Integer> list1=new ArrayList<>();

        for (int i = list.size() - 1; i >= 0; i--) {

            int each=list.get(i);
            list1.add(each);
            
        }
        System.out.println(list1);


    }
}
