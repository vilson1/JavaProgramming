package day01;


import utilities.StringUtility;

public class HelloWorld {

    public static void main( String [] args)
    {


        String str="Wooden Spoon";
        StringUtility.printEachChar(str);
        String str2="I love Java!";
        String reverse=StringUtility.reverse(str2);
        System.out.println(str2);
        System.out.println(StringUtility.removeDublicates(str));


    }


}
