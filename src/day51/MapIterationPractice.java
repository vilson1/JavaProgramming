package day51;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapIterationPractice {
    public static void main(String[] args) {
        Map<String,Integer> scores=new HashMap<>();
        scores.put("Aygun",85);
        scores.put("Maria",86);
        scores.put("Ali",95);
        scores.put("Alex",97);
        scores.put("Ozan",98);
        scores.put("Serkan",96);
        scores.put("Andey",95);


       Set<String> keys= scores.keySet();

        for (String key : keys) {

            System.out.println(key +" : "+scores.get(key));
            Integer eachValue=scores.get(key);
            if (eachValue<=90){

                System.out.println("eachValue = " + eachValue);

            }
        }
    }
}
