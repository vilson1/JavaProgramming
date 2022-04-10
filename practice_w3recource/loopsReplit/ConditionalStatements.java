package loopsReplit;
import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args) {


        //1. Write a Java program to get a number from the user and print whether it is positive or negative.
        /*Scanner in = new Scanner(System.in);
        System.out.println("Enter the number!");
        int num = in.nextInt();

        if (num>0)
        {
            System.out.println("Number " + num + " is POSITIVE");
        }
        else  if (num<0)
        {
            System.out.println("Number " + num + " is NEGATIVE");
        }
        else
            System.out.println("Number is 0");
*/

        //------------------------------------------------------------------------------------------------


        //2. Write a Java program to solve quadratic equations (use if, else if and else).

      /*  Scanner in = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        int a= in.nextInt();
        System.out.println("Enter the value of b:");
        int b= in.nextInt();
        System.out.println("Enter the value of c:");
        int c= in.nextInt();

        double det = b*b -4*a*c;
        double root1,root2;

        if (det>0)
        {
            root1=(-b+Math.sqrt(det))/2*a;
            root2 = (-b-Math.sqrt(det))/2*a;
            System.out.println("root1 = " + root1);
            System.out.println("root2 = " + root2);
        }
        else  if (det==0)
        {
            root1=-b/2*a;
            System.out.println("root1=root2 = "+ root1);
        }
        else
            System.out.println("we can not find the roots:");
*/

        //------------------------------------------------------------------------------------

        //3. Take three numbers from the user and print the greatest number.

        /*Scanner in = new Scanner(System.in);

        int num1,  num2, num3;

        System.out.println("Enetr first number");
        num1= in.nextInt();
        System.out.println("Enetr second number");
        num2= in.nextInt();
        System.out.println("Enetr third number");
        num3= in.nextInt();

        if (num1> num2 || num1>num3)
        {
            System.out.println(num1 + " is bigger from entered numbers");
        }
         else if (num2> num1 || num2>num3)
        {
            System.out.println(num2 + " is bigger from entered numbers");
        }
         else
            System.out.println(num3 + " is bigger from entered numbers");
*/

//        Write a Java program that reads a floating-point number and prints "zero" if the number is zero.
//        Otherwise, print "positive" or "negative".
//            Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000.

/*

        Scanner in = new Scanner(System.in);

        System.out.println("Input the number:");
        double number= in.nextDouble();

        if (number>0)
        {
            if (number>1000000)
            {
                System.out.println(number+ " is positive large number");
            }
            else if (number<1)
            {
                System.out.println(number+ " is positive small number");
            }
            else
                System.out.println(number+ " is positive  number");
        }
        else  if (number<0)
        {
            if (Math.abs(number)>1000000)
            {
                System.out.println(number+ " is negative large number");
            }
            else if (Math.abs(number)<1)
            {
                System.out.println(number+ " is negative small number");
            }
            else
                System.out.println(number+ " is negative  number");
        }
        else
            System.out.println("Number is 0");
*/

//        5. Write a Java program that keeps a number from the user and generates an
//        integer between 1 and 7 and displays the name of the weekday.

      /*  Scanner in= new Scanner(System.in);

        System.out.println("Enter a nmber between 1-7");
        int day= in.nextInt();



        String dayName = "";
        switch (day) {
            case 1:
                dayName = "Monday";
                System.out.println("dayName = " + dayName);
                break;
            case 2:
                dayName = "Tuesday";
                System.out.println("dayName = " + dayName);
                break;
            case 3:
                dayName = "Wednesday";
                System.out.println("dayName = " + dayName);
                break;
            case 4:
                dayName = "Thursday";
                System.out.println("dayName = " + dayName);
                break;
            case 5:
                dayName = "Friday";
                System.out.println("dayName = " + dayName);
                break;
            case 6:
                dayName = "Saturday";
                System.out.println("dayName = " + dayName);
                break;
            case 7:
                dayName = "Sunday";
                System.out.println("dayName = " + dayName);
                break;
            default:
                dayName = "Invalid day range";
                System.out.println("dayName = " + dayName);
        }*/

//        6. Write a Java program that reads in two floating-point numbers and tests whether
//        they are the same up to three decimal places

/*

        Scanner in = new Scanner(System.in);

        System.out.println("enter first number");
        double n1=in.nextDouble();
        System.out.println("enter second number");
        double n2=in.nextDouble();
        n1=Math.round(n1*1000);
        n1= n1/1000;

        n2= Math.round(n2*1000);
        n2=n2/1000;


        if (n1==n2)
        {
            System.out.println("Numbers are equal");

        }
        else
            System.out.println("Numbers are different");

*/

        //7. Write a Java program to find the number of days in a month.
/*

        Scanner in= new Scanner(System.in);

        System.out.println("Enter a month number");
        int month = in.nextInt();
        System.out.println("Enter the year:");
        int year= in.nextInt();

            String monthname;
            int days;
            switch (month)
            {
                case 1:
                {
                    monthname="January";
                    days=31;
                    System.out.println(monthname + "" + year + " has" +days);
                    break;
                }
                case 2:
                {
                    if (year%4==0) {
                        monthname = "February";
                        days = 29;
                        System.out.println(monthname + "" + year + " has" +days);
                    }
                    else {
                        monthname = "February";
                        days = 28;
                        System.out.println(monthname + "" + year + " has" +days);
                    }
                        break;

                }
                case 3:
                {
                    monthname="March";
                    days=31;
                    System.out.println(monthname + "" + year + " has" +days);
                    break;
                }
                case 4:
                {
                    monthname="April";
                    days=30;
                    System.out.println(monthname + "" + year + " has" +days);
                    break;
                }
                case 5:
                {
                    monthname="May";
                    days=31;
                    System.out.println(monthname + "" + year + " has" +days);
                    break;
                }
                case 6:
                {
                    monthname="June";
                    days=30;
                    System.out.println(monthname + "" + year + " has" +days);
                    break;
                }
                case 7:
                {
                    monthname="July";
                    days=31;
                    System.out.println(monthname + "" + year + " has" +days);
                    break;
                }
                case 8:
                {
                    monthname="August";
                    days=31;
                    System.out.println(monthname + "" + year + " has" +days);
                    break;
                }
                case 9:
                {
                    monthname="September";
                    days=30;
                    System.out.println(monthname + "" + year + " has" +days);
                    break;
                }
                case 10:
                {
                    monthname="October";
                    days=31;
                    System.out.println(monthname + "" + year + " has" +days);
                    break;
                }
                case 11:
                {
                    monthname="November";
                    days=30;
                    System.out.println(monthname + "" + year + " has" +days);
                    break;
                }
                case 12:
                {
                    monthname="December";
                    days=31;
                    System.out.println(monthname + "" + year + " has" +days);
                    break;
                }
                default:
                    System.out.println("invalid Month Number...");

*/

        //8. Write a Java program that takes the user to provide a single character from the alphabet.
        // Print Vowel or Consonant, depending on the user input. If the user input is not a letter
        // (between a and z or A and Z), or is a string of length > 1, print an error message.
/*

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a character");
        String letter = in.next().toLowerCase();

        boolean uppercase = letter.charAt(0) >= 65 && letter.charAt(0) <= 90;
        boolean lowercase = letter.charAt(0) >= 97 && letter.charAt(0) <= 122;
        boolean vowels = letter.equals("a") || letter.equals("e") || letter.equals("i")
                || letter.equals("o") || letter.equals("u");

        if (letter.length()>1)
        {
            System.out.println("Error. Not a single character.");
        }
        else if (!(uppercase || lowercase))
        {
            System.out.println("Error. Not a letter. Enter uppercase or lowercase letter.");
        }
        else if (vowels)
        {
            System.out.println("Input letter is Vowel");
        }
        else
            System.out.println("Input letter is Consonant");

*/
//---------------------------------------------------------------------------------------------------------------


        // 9. Write a Java program that takes a year from user and print whether that year is a leap year or not.

    /*    Scanner in = new Scanner(System.in);

        System.out.println("Enter the year!");
        int year= in.nextInt();
        boolean lapYear= (year%4==0 || year%100==0);

        if (lapYear)
        {
            System.out.println(year + " is lap year");
        }
        else
            System.out.println(year +" is not lap year");

*/

//-------------------------------------------------------------------------------------------

        //10. Write a program in Java to display the first 10 natural numbers.
/*

        int i;
        System.out.println("First 10 natural numbers are:");
        for (i=1; i<=10; i++)
        {
            System.out.println(i);
        }
*/
//-----------------------------------------------------------------------------------------

        //11. Write a program in Java to display n terms of natural numbers and their sum.
/*

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of terms:");
        int terms= in.nextInt();
        int sum=0, i;
        System.out.println("First "+ terms+" terms of natural numbers are:");
        for (i=0; i<=terms; i++)
        {
            System.out.println(i);
            sum =sum+i;


        }
        System.out.println("sum = " + sum);
*/

        Scanner s = new Scanner(System.in);

        int house = s.nextInt();
        int player = s.nextInt();

        String output = house+player<=21? (house>player? "player loss" :house==player? "its a tie" : "player win") : "player bust";
        System.out.println("output = " + output);






















        }
}







