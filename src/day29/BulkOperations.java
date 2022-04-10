package day29;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        System.out.println(list);
        list.removeAll(Arrays.asList(3,5,8));

        System.out.println(list);

        System.out.println("--------------------------------------");

        ArrayList<Integer> numbers= new ArrayList<>();
        numbers.addAll(Arrays.asList(100,200,300,400,500,600,700,800,900));
        System.out.println(numbers);
        numbers.retainAll(Arrays.asList(100,200,300));
        System.out.println(numbers);

        System.out.println("---------------------------------------");

        ArrayList<String> jobTitles= new ArrayList<>();
        jobTitles.addAll(Arrays.asList("QA","Sdet","developer","QA","Sdet", "ScrumMaster","BA","BA"));
        jobTitles.retainAll(Arrays.asList("QA","Sdet"));
        System.out.println(jobTitles);

        System.out.println("--------------------------------------");

        ArrayList<Integer> nums= new ArrayList<>();
        nums.addAll(Arrays.asList(1,2,3,4,5,6,7,1,2,3,8,9,10));
        boolean r=nums.containsAll(Arrays.asList(2,5,10));
        System.out.println(r);
    }

    public static ArrayList<Integer> convertArrayToArrayList(int[] arr){
        ArrayList<Integer> list=new ArrayList<>();

        for (int each : arr) {
            list.add(each);
            
        }
        return list;
    }
}
