package day29;

import java.util.ArrayList;

public class FirstUniqueElement {
    public static void main(String[] args) {
        //Write a program that can return the first unique element from an ArrayList

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(5);

        System.out.println(numbers);



        for (Integer each : numbers) {
            int frequency=0;
            for (Integer number : numbers) {
                if (each==number)
                    frequency++;
                
            }
            if (frequency==1){
                System.out.println(each);
                break;
            }

        }

    }
}
