package day29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FindnthLargestNumber {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        int n=2;

        for (int i = 1; i < n; i++) {
            list.removeIf(p-> Collections.max(list)==p);
        }
        int max=Collections.max(list);
        System.out.println(max);



    }
}
