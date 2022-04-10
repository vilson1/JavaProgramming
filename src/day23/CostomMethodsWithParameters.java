package day23;

public class CostomMethodsWithParameters {
    public static void main(String[] args) {
        oddOrEven(10);
        age(1991);
        printNumbers(10,15);

    }
    public static void oddOrEven(int num) {
        if (num%2==0)
        {
            System.out.println("Even");
        }
        else
            System.out.println("Odd");
    }

    public static void age(int birthYear){
        int age=2022-birthYear;
        System.out.println("age = " + age);
    }

    public static void printNumbers(int x, int y){
        for (int i = x; i <=y ; i++) {
            System.out.println(i);

        }
    }

}
