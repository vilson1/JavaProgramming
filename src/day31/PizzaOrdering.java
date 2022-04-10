package day31;

import java.util.ArrayList;
import java.util.Arrays;


public class PizzaOrdering {
    public static void main(String[] args) {

        Pizza order1=new Pizza('S',2,3);
        Pizza order2=new Pizza('M',3,4);
        Pizza order3=new Pizza('L',4,5);
        ArrayList<Pizza> ordering=new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            ordering.addAll(Arrays.asList(order1,order2,order3));

        }
        System.out.println(ordering.size());

        double totalPrice=0;

        for (Pizza pizza : ordering) {
           totalPrice+= pizza.cost();

        }
        System.out.println(totalPrice);
    }
}
