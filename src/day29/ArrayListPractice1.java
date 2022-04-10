package day29;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice1 {
    public static void main(String[] args) {
        String[] counyties={"Japan", "Korea","United States", "Turkey","United Kingdom", "Canada"};

        ArrayList<String> list =new ArrayList<>(Arrays.asList(counyties));
        list.removeIf(p->p.length()>10);

        counyties=list.toArray(new String[0] );
        System.out.println(Arrays.toString(counyties));

    }
}
