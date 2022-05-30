package day51;

import java.util.*;

public class MapClasses {
    public static void main(String[] args) {
        Map<Integer,String> hashMap=new HashMap<>();
        hashMap.put(10,"Arthur");
        hashMap.put(20,"George");
        hashMap.put(3,"Jack");
        hashMap.put(40,"Emma");
        hashMap.put(5,"Isabella");
        System.out.println("hashMap = " + hashMap);

        Map<Integer,String> linkedHashMap=new LinkedHashMap<>();
        System.out.println("------------------------------------------");

        linkedHashMap.put(10,"Arthur");
        linkedHashMap.put(20,"George");
        linkedHashMap.put(3,"Jack");
        linkedHashMap.put(40,"Emma");
        linkedHashMap.put(5,"Isabella");
        System.out.println("linkedHashMap = " + linkedHashMap);
        System.out.println("==================================================");

        Map<Integer,String> treeMap=new TreeMap<>();

        Map<Integer,String> hashtable=new Hashtable<>();

    }
}
