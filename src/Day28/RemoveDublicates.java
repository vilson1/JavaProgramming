package Day28;

import java.util.ArrayList;

public class RemoveDublicates {
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

        ArrayList<Integer> result= new ArrayList<>();

        for (Integer each : list) {
            if (!result.contains(each)){
                result.add(each);
            }

        }
        System.out.println(result);
    }
}
