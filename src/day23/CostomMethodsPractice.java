package day23;

public class CostomMethodsPractice {
    public static void main(String[] args) {
        greeting();
        cydeo();
        evenNumbers();

    }

    public static void greeting(){
        String g="Hello World!  ";
        g=g.repeat(5);
        System.out.println(g);
    }
    public static void cydeo(){
        for (int i = 0; i <5 ; i++) {
            System.out.println("Hello Cydeo!");

        }
    }
    public static void evenNumbers(){
        for (int i = 1; i <=10 ; i++) {
            if (i%2==0)
                System.out.println(i);

        }
    }
}
