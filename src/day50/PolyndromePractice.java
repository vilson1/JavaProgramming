package day50;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class PolyndromePractice {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.addAll(Arrays.asList("Java","Python","Cydeo","Car","level","civic","radar","kayak","reviver","racecar"));

        Iterator<String> it=list.iterator();

        while (it.hasNext()){
            String each=it.next();
            String reverse="";
            for (int i=each.length()-1;i>0;i--)
                if (each.equalsIgnoreCase(reverse)){
                    it.remove();
                }
        }

    }
}
