package loopsReplit;

public class DataTypes {
    public static void main(String[] args) {

        // 1. Write a Java program to convert temperature from Fahrenheit to Celsius degree.

        /*

        Scanner in= new Scanner(System.in);

        double fahrenheit, celcius;

        System.out.println("Enter temperature in Fahrenheit");
        fahrenheit=in.nextDouble();

        celcius= (( 5 *(fahrenheit - 32.0)) / 9.0);

        System.out.println(fahrenheit + " degree in Fahrenheit = "+celcius + " degree in Celcius");

         */


        //-------------------------------------------------------------------------------------------------------

        //2. Write a Java program that reads a number in inches, converts it to meters.
        /*

        Scanner input = new Scanner(System.in);

        System.out.print("Input a value for inch: ");
        double inch = input.nextDouble();
        double meters = inch * 0.0254;
        System.out.println(inch + " inch is " + meters + " meters");

         */

        //---------------------------------------------------------------------------------------------------------

        //Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer.

        /*

        Scanner in = new Scanner(System.in);

        System.out.println("Input an integer between 0 and 1000");
        int num = in.nextInt();

        int firstDigit, secondDigit,thirdDigit, sum;
        firstDigit=num/100;
        secondDigit=(num%100)/10;
        thirdDigit=(num%100)%10;

        sum=firstDigit+secondDigit+thirdDigit;
        System.out.println("The sum of all digits in " + num + " is " + sum   );

         */


        //---------------------------------------------------------------------------------------------------------



        //4. Write a Java program to convert minutes into a number of years and days.

        /*

        double minutesInYear = 60 * 24 * 365;

        Scanner input = new Scanner(System.in);

        System.out.print("Input the number of minutes: ");

        double min = input.nextDouble();

        long years = (long) (min / minutesInYear);
        int days = (int) (min / 60 / 24) % 365;


        System.out.println((int) min + " minutes is approximately " + years + " years and " + days + " days");

         */

        //----------------------------------------------------------------------------------------------------------



       // 6. Write a Java program to compute body mass index (BMI).

       // BMI=weight/heiht^2

        /*

        Scanner in = new Scanner(System.in);

        System.out.println("Add weight kg");
        double weight = in.nextDouble();

        System.out.println("Add height in meter");
        double height= in.nextDouble();

        double BMI = weight/(height*height);

        System.out.println("Body Mass Index is "+ BMI);

         */


        //------------------------------------------------------------------------------------------------------


    /*    7. Write a Java program to takes the user for a distance (in meters)
        and the time was taken (as three numbers: hours, minutes, seconds),
        and display the speed, in meters per second, kilometers per hour
        and miles per hour (hint: 1 mile = 1609 meters).*/


//        Scanner in = new Scanner(System.in);
//
//        float meters, hours, minutes, seconds;
//
//        System.out.println("Enter distance in meter");
//        meters=in.nextFloat();
//
//        System.out.println("Enter the hours:");
//        hours=in.nextFloat();
//
//        System.out.println("Enter the minutes:");
//        minutes=in.nextFloat();
//
//        System.out.println("Enter the seconds:");
//        seconds=in.nextFloat();
//
//
//
//        float speedMS= meters/(hours*3600+ minutes *60+seconds)*1.0f;
//        float speedKmH=(meters/1000)/(hours+minutes/60+seconds/3600)*1.0f;
//
//        System.out.println("speedMS = " + speedMS +" m//s");
//        System.out.println("speedKmH = " + speedKmH + " Km//h");


        //---------------------------------------------------------------------------------------------


        //8. Write a Java program that reads a number and display the square, cube, and fourth power.

//        Scanner in= new Scanner(System.in);
//
//        System.out.println(" Enter the number");
//        int num=in.nextInt();
//
//        long square=num*num;
//        long cube = square*num;
//        long forthP=cube*num;
//
//        System.out.println("num = " + num);
//        System.out.println("square = " + square);
//        System.out.println("cube = " + cube);
//        System.out.println("forthP = " + forthP);


        //------------------------------------------------------------------------------------------------


       /* Write a Java program that accepts two integers from the user and then prints the sum,
        the difference, the product, the average, the distance (the difference between integer),
                the maximum (the larger of the two integers), the minimum (smaller of the two integers).*/

       /* Scanner in= new Scanner(System.in);

        System.out.println("Enter first number");
        int num1 = in.nextInt();

        System.out.println("Enter second number");
        int num2 = in.nextInt();

        int sum= num1+num2;
        int diff = num1-num2;
        int product= num1*num2;
        double average = sum/2;
        int distance = Math.abs(num1-num2);
        int max= Math.max(num1,num2);
        int min = Math.min(num1,num2);

        System.out.println("sum = " + sum);
        System.out.println("diff = " + diff);
        System.out.println("product = " + product);
        System.out.println("average = " + average);
        System.out.println("distance = " + distance);
        System.out.println("max = " + max);
        System.out.println("min = " + min);*/


        //------------------------------------------------------------------------------

        //10. Write a Java program to break an integer into a sequence of individual digits.

        /*Scanner in = new Scanner(System.in);
        System.out.println("Write a 6 digit number");
        int num = in.nextInt();
        int num1= num/100000;
        int rem= num%100000;
        int num2 = rem/10000;
        rem = rem%10000;
        int num3 =rem/1000;
        rem= rem%1000;
        int num4 =rem/100;
        rem= rem%100;
        int num5 =rem/10;
        rem= rem%10;
        int num6 =rem;

        System.out.println(num1 +" "+ num2 +" "+num3 +" "+num4 +" "+num5 +" "+num6 +" ");
        */


        //--------------------------------------------------------------------

















    }
}


