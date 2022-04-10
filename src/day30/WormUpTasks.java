package day30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WormUpTasks {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        System.out.println(list);
        Collections.swap(list,0,list.size()-1);
        System.out.println(list);


        System.out.println("---------------------------------------");
        ArrayList<Integer> list2=new ArrayList<>();
        list2.addAll(Arrays.asList(1,0,2,0,3,0,4,0));
       int size=list2.size();
       list2.removeAll(Arrays.asList(0));

       int newSize=size-list2.size();
        for (int i = 0; i < newSize; i++) {
            list2.add(0);

        }
        System.out.println(list2);

        System.out.println("-------------------------------------------");

        String str="ABCD123$%^&#456EFG!";

        ArrayList<Character> chars=new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {

            chars.add(str.charAt(i));
        }

        ArrayList<Character> list3=new ArrayList<>(chars);
        list3.removeIf(p->!Character.isLetter(p));


        ArrayList<Character> digits=new ArrayList<>(chars);
        digits.removeIf(p->!Character.isDigit(p));

        ArrayList<Character> symbols=new ArrayList<>(chars);
        symbols.removeAll(digits);
        symbols.removeAll(list3);

        System.out.println(list3);
        System.out.println(digits);
        System.out.println(symbols);

        
    }
}
