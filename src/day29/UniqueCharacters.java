package day29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str="aaabcccdeeef";

        ArrayList<String> list=new ArrayList<>(Arrays.asList(str.split("")));
        System.out.println("list = " + list);

        String unique="";
        for (String s : list) {
            if (Collections.frequency(list,s)==1){
                unique+=s;
            }

        }
        System.out.println(unique);
    }
}
