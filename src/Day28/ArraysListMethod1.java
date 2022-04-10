package Day28;
import java.util.ArrayList;
public class ArraysListMethod1 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers= new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.add(2,25);
        numbers.add(5,25);

        System.out.println(numbers);
        System.out.println(numbers.get(3));
        System.out.println("--------------------------");

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));

        }

        System.out.println("---------------------------------------");

        ArrayList<String> list=new ArrayList<>();
        list.add("java");
        list.add("python");
        list.add("c#");
        list.add("ruby");
        list.add(3,"java");

        list.set(2,"java script");
        list.set(2,"c++");
        System.out.println(list);

        System.out.println("----------------------------------------");

        ArrayList<String> employees= new ArrayList<>();
        employees.add("vilson");
        employees.add("Shehu");
        employees.add("Amar");
        employees.add("Ervisa");
        employees.add("Erblend");
        employees.add("Ariela");
        employees.add("Perla");
        employees.add("Ajan");

        employees.remove("vilson");

        employees.remove(1);
        System.out.println(employees);

        System.out.println("-------------------------------------");

        ArrayList<Integer> list1= new ArrayList<>();
        list1.add(100);
        list1.add(100);
        list1.add(100);

        ArrayList<Integer> list2= new ArrayList<>();
        list2.add(100);
        list2.add(100);
        list2.add(100);

        System.out.println(list1==list2);
        System.out.println(list1.equals(list2));

        System.out.println("-------------------------------");

        System.out.println(list1.isEmpty());



    }
}
