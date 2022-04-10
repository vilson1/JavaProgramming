package Day28;

import java.util.ArrayList;

public class UniqueElement {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("java");
        list.add("java");
        list.add("java");
        list.add("python");
        list.add("c#");
        list.add("c#");
        list.add("c#");
        list.add("c#");
        list.add("Ruby");
        list.add("c++");
        list.add("c++");

        ArrayList<String> unique= new ArrayList<>();

        for (String each : list) {

            if (list.indexOf(each)==list.lastIndexOf(each)){
                unique.add(each);
            }

        }

        System.out.println(unique);
        System.out.println(list.contains("c++"));
    }
}
