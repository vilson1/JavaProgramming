package day29;

import java.util.ArrayList;

public class MaxMinAverage {
    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);

        int max= list.get(0);
        for (Integer integer : list) {
            if (max<integer){
                max=integer;
            }

        }
        int min=list.get(0);
        for (Integer each : list) {
            if (min>each)
                min=each;

        }

        int sum=0;
        for (Integer each : list) {
            sum+=each;

        }
        double average=sum*1.0/list.size();

        System.out.println(max);
        System.out.println(min);
        System.out.println(average);
    }
}
