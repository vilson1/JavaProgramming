package day49;

import java.util.*;

public class SetPractice {
    public static void main(String[] args) {
        String[] arr={"Wooden Spoon", "Book", "Pen", "Phone","Wooden Spoon", "Wooden Spoon","Wooden Spoon",
                "Wooden Spoon","Wooden Spoon","Milk","Eggs","Coke","Paper Towels"};

       arr= new HashSet<>(Arrays.asList(arr)).toArray(new String[0]);

        Set<String> set1=new HashSet<>(Arrays.asList(arr));
        System.out.println("set1 = " + set1);
        arr=set1.toArray(new String[0]);


        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1000,300,1000,200,300,400,500,500,600,10,10,20,30,20,10));

       list=new ArrayList<>( new LinkedHashSet<>(list));
        System.out.println("list = " + list);


        Integer[] num={1,2,3,4,5,1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10};
        num=new LinkedHashSet<>(Arrays.asList(num)).toArray(new Integer[0]);

        String str="aaaaaaabbbccccccccccccccdddddttttt";
        String result="";
        for (String each : new LinkedHashSet<>(Arrays.asList(str.split("")))) {
          result+=each+  Collections.frequency(Arrays.asList(str.split("")) ,each);
            
        }
        System.out.println("result = " + result);
    }
}
