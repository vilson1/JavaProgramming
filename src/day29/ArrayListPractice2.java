package day29;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Ali", "David","Ahmed","Jimmy","Daniel","Aaron","Ahmed","David","Shay"));

        list.retainAll(Arrays.asList("David","Ahmed"));
        System.out.println(list);

        System.out.println("----------------------------------------");

        String[] arr={"Mary","Monika","Mehray","Musti","Sumeyra","Hasan","Beril"};

        ArrayList<String> list2=new ArrayList<>(Arrays.asList(arr));
        list2.removeIf(p->p.startsWith("M"));

        System.out.println(list2);
        arr=list2.toArray(new String[0]);

        System.out.println(Arrays.toString(arr));
    }
}
