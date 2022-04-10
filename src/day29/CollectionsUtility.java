package day29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Collection;

public class CollectionsUtility {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(10,9,8,7,6,5,4,3,2,1));

        Collections.sort(list);
        System.out.println(list);

        System.out.println("---------------------------------");

        ArrayList<Character> list1=new ArrayList<>();
        list1.addAll(Arrays.asList('A','B','C','D','E'));

        Collections.reverse(list1);
        System.out.println(list1);

        System.out.println("--------------------------------");

        ArrayList<Integer> list2=new ArrayList<>();
        list2.addAll(Arrays.asList(10,20,30,40,50,60,70));
        Collections.swap(list2,4,1);
        System.out.println(list2);

        System.out.println("-------------------------");
        int max=Collections.max(list2);
        int min=Collections.min(list2);

        System.out.println(max);
        System.out.println(min);

        ArrayList<Integer> list3= new ArrayList<>();
        list3.addAll(Arrays.asList(10,10,20,30,40,50,10,10,10));
        Collections.replaceAll(list3,10,100);
        System.out.println(list3);
        System.out.println("-------------------------------------------");

        int freq=Collections.frequency(list3, 100);
        System.out.println(freq);

        System.out.println("====================================");

        ArrayList<String> words=new ArrayList<>();
        words.addAll(Arrays.asList("Java", "Java", "Python", "Python","Ruby","C#"));
        int countJava=Collections.frequency(words,"Java");
        int countPython=Collections.frequency(words,"Python");

        System.out.println("countPython = " + countPython);
        System.out.println("countJava = " + countJava);





    }
}
