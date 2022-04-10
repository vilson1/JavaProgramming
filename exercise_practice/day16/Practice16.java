package day16;

import java.util.Scanner;

public class Practice16 {
    public static void main(String[] args) {
      /*  Write a program that asks user to enter number for 5 times, and print
        how many positive and negative numbers user entered
        */

        Scanner in=new Scanner(System.in);

       /* int positive=0;
        int negative=0;
        for (int i = 0; i < 5; i++) {
            int num1= in.nextInt();
            if (num1>0)
                positive++;
            else if (num1<0)
                negative++;


        }
        System.out.println(positive+" positive and "+negative+" negative");

        System.out.println("---------------------------");
*/
       /* Write a program that asks user to entera string and a char, the
        returns the frequency of the char from the given string*/

    /*    String str= in.nextLine();

        char ch=in.next().charAt(0);
        int count=0;

        for (int i = 0; i <str.length() ; i++) {
            if (str.charAt(i)==ch){
                count++;
            }

        }
        System.out.println(count);*/


        System.out.println("__________________________________________");


    /*    3. Write a program that asks user to enter two positive numbers,
                then multiply those two numbers without using multiplication (*)
        operator.
        if user enters any negative numbers, print Invalid*/

        /*System.out.println("Enter 2 numbers");
        int num1=in.nextInt();
        int num2=in.nextInt();
        int result=0;
        if (num1<0||num2<0){
            System.out.println("Invalid Number");
            System.exit(0);
        }
        for (int i = 0; i < num2; i++) {

             if (num2==0){
                result=0;
            }
            else
                result+=num1;


        }
        System.out.println(result);*/

        System.out.println("-----------------------------------");

       /* 4. write a program that can return the frequency of the a word Java from
        the sentence*/

      /*  String str= in.nextLine();
        int count=0;
        for (int i = 0; i < str.length()-4; i++) {
            if (str.substring(i,i+4).equals("Java"))
                count++;


        }
        System.out.println(count);
*/

        System.out.println("----------------------------------------");

      /*  5. write a program to print true if the string "cat" and "dog" appear the
        same number of times in the given sentence*/

      /*  String str= in.nextLine();
        int countCat=0;
        int countDog=0;

        for (int i = 0; i < str.length()-2; i++) {
            if (str.substring(i,i+3).equals("cat"))
                countCat++;
            if (str.substring(i,i+3).equals("dog"))
                countDog++;

        }
        if (countCat==countDog)
            System.out.println(true);
        else
            System.out.println(false);*/

        
    }
}
