package day51;

import java.util.HashMap;
import java.util.Map;

public class MapMethods {
    public static void main(String[] args) {
        Map<String,Integer> scores=new HashMap<>();
        scores.put("Aygun",85);
        scores.put("Maria",86);
        scores.put("Ali",95);
        scores.put("Alex",97);
        scores.put("Ozan",98);
        scores.put("Serkan",96);
        scores.put("Andey",95);

        System.out.println("scores = " + scores);
        System.out.println("scores.size() = " + scores.size());

        System.out.println("scores.get(Maria) = " + scores.get("Maria"));

       scores.replace("ALi", 100);
        System.out.println("scores.get(\"Ali\") = " + scores.get("Ali"));

        System.out.println("scores.containsKey(\"Ozan\") = " + scores.containsKey("Ozan"));
        System.out.println("scores.containsValue(100) = " + scores.containsValue(100));

    }
}
