package day50;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetListPractice {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        set.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5));

      ArrayList<Integer> list= new  ArrayList<>(set);


    }
}
