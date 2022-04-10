package Day28;

import java.util.ArrayList;

public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> num= new ArrayList<>();
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        num.add(50);
        num.add(60);

        for (int i = 0; i < num.size(); i++) {

             num.set(i, num.get(i)*2);

        }

        System.out.println(num);
    }
}
