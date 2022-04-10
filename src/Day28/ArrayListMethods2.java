package Day28;

import java.util.ArrayList;

public class ArrayListMethods2 {
    public static void main(String[] args) {

        ArrayList<Integer> list= new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(200);
        list.add(200);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);

        Integer num=200;
        list.remove(num);
        System.out.println(list);


    }




}
