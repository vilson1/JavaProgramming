package day50;

import java.util.*;

public class IterablePractice2 {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>();
        names.addAll(Arrays.asList("Ahmed","ahmed","aHmED","John","Ercan","Daniel","Mustafa","ahmed","Julia","Mohammed"));

      Iterator<String> it= names.iterator();

      while (it.hasNext()){
          if (it.next().equalsIgnoreCase("ahmed")){
              it.remove();
          }
      }
        System.out.println("names = " + names);

        List<String> names2=new ArrayList<>();
        names2.addAll(Arrays.asList("Ahmed","ahmed","aHmED","John","Ercan","Daniel","Mustafa","ahmed","Julia","Mohammed"));

        System.out.println(names2);

        for (Iterator<String> i=names2.iterator(); i.hasNext();){
            if (i.next().equalsIgnoreCase("ahmed"));
            i.remove();
        }
        System.out.println(names2);

        List<String> names3=new ArrayList<>();
        names3.addAll(Arrays.asList("Ahmed","ahmed","aHmED","John","Ercan","Daniel","Mustafa","ahmed","Julia","Mohammed"));

        names3.removeIf(p->p.equalsIgnoreCase("ahmed"));
        System.out.println("names3 = " + names3);

        Set<Integer> set=new HashSet<>(Arrays.asList(1,2,3,4,5,6,7,8,9,100,90,89,79,50));

        Iterator<Integer> it2=set.iterator();

        while (it2.hasNext()){
            if (it2.next()%2==0){
                it2.remove();
            }
        }
        System.out.println("set = " + set);

    }
}
