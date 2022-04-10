package week06;

import java.util.Scanner;

public class LoopsSampeExamples {
    public static void main(String[] args) {
/*
        for (int i=0; i<=1000; i+=10)
        {
            System.out.print(i+" ");
        }
        System.out.println();*/

        //===========================================================

       /* for (int i = 3; i < 130; i++) {
            if (i%2!=0)
            {
                System.out.print(i+" ");
            }
            
        }*/

        //==============================================================

        /*int count =0;
        for (int i=5; i<=50; i++)
        {
            if (i%2==0)
            {
                count=count+1;
            }

        }
        System.out.println(count);*/

        //===================================================================


/*

        for (int i = 0; i <=12; i++) {

            System.out.println("12*"+i+"="+12*i);


        }
*/

        //=======================================================

      /*  for (char i ='A'; i < 'Z' ;i++) {
            System.out.print(i+" ");

        }*/



        //======================================================================

        /*Scanner in = new Scanner(System.in);
        System.out.println("Enter upper bound");
        int number= in.nextInt();

        int sum=0;

        for (int i = 0; i <= number; i++) {
            sum+=i;
            
        }
        System.out.println("sum = " + sum);*/

        //=====================================================

        /**
         * 5.
         * Given a string password. Encrypt with "x" a given password
         * and print.
         * (do with for loop)
         * password: cydeo
         * encrypt with char :x
         * output:cxyxdxexox
         */

        /*Scanner in = new Scanner(System.in);
        System.out.println("Enter pass");
        String s= in.next();

        char encriptWithChar='x';
        String encriptetpass="";



        for (int i =0; i<s.length(); i++)
        {
            encriptetpass=encriptetpass+s.charAt(i)+encriptWithChar+"";
        }
        System.out.println(encriptetpass);*/


        //=======================================
        Scanner in=new Scanner(System.in);
        System.out.println("Enter nth term");
        int term= in.nextInt();

        int sum=0, num1=0, num2=1;

        for (int i = 2; i <= term; i++) {

           sum=num1+num2;
           num1=num2;
           num2=sum;


        }
        System.out.println(sum);








    }
}
