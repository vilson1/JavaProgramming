package day42;

import day41.MorningWorkout;

public class DisadvantagesOfThrowKeyWord {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hello");
        sleep(2);

        System.out.println("Hello World");


        System.out.println("-------------------");

        System.out.println("Hello");
        MorningWorkout.sleep(2);
        System.out.println("Cydeo");
    }
    public static void sleep(double seconds) throws InterruptedException {

            Thread.sleep((long)(seconds*1000));

    }
}
