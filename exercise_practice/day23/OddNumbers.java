package day23;

import utilities.MathUtility;

import javax.swing.text.Utilities;

public class OddNumbers {
    public static void main(String[] args) {



    }

    //1. create a method that can print odd numbers between 1~100 in a
    //same line saperated by space

    public static void printOdds(){
        for (int i = 0; i <=100 ; i++) {
            if (i%2!=0)
                System.out.print(i+" ");

        }
    }

   /* 2. create a method that can print even numbers between 1~100 in a
    same line saperated by space*/

    public static void printEvens(){
        for (int i = 0; i <=100 ; i++) {
            if (i%2==0)
                System.out.print(i+" ");

        }
    }

/*    3. create a method that can check if a person is eligible to buy
    alcohol3. create a method that can check if a person is eligible to buy
    alcohol*/

    public static void isEligibleToByAlcohool(int age){
        if (age>100 || age <0){
            System.out.println("Invalid Age!");
        }
        else if (age>=18){
            System.out.println("is eligible");
        }
        else
            System.out.println("is not eligible");
    }

    /*5. create a method that can calculate the grade of the student based
    on the score*/

    public static void grade(int score){
        if (score>100 || score<0){
            System.out.println("Invalid score");
        }
        char grade=score>90? 'A':score>80? 'B' : score>70? 'C': score>60? 'D' : 'F';
        System.out.println(grade);
    }

    //6. create a method that can calculate the area of a circle

    public static void area(int radius){
        double area=radius*radius*3.14;
        System.out.println(area);
    }

    



}
