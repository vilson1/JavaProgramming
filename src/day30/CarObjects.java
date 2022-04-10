package day30;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {
    public static void main(String[] args) {
        Car car1=new Car();
        car1.carInfo("Citroen","C1",2013,"black",6000);
        System.out.println(car1);
        car1.start();

        Car car2=new Car();
        car2.carInfo("wv","Golf5",2006,"Grey",2000);
        System.out.println(car2);

        Car car3=new Car();
        car3.carInfo("Toyota","Corrola",2020,"White",15000);
        System.out.println(car3);

        //Car[] cars={car1,car2,car3};

        ArrayList<Car> list=new ArrayList<>();
        list.addAll(Arrays.asList(car1,car2,car3));

        for (Car car : list) {
            System.out.println(car.brand+" "+car.price);
            
        }

        list.removeIf(p-> p.brand.equals("Toyota")&& p.year>=1995&&p.year<=1997);
        list.removeIf(p-> p.brand.equals("wv")&& p.year>=2005&&p.year<=2010);

        System.out.println(list);




    }
}
