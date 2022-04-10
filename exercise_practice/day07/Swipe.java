package day07;

public class Swipe {
    public static void main(String[] args) {
      //  1. write a program that can swipe two variables' value by using a temporary variable

        int a =5;
        int b=3;

        int c;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        c=a;
        a=b;
        b=c;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a=a*(b/a);
        b=b*(a/b);
        System.out.println("a = " + a);
        System.out.println("b = " + b);



    }
}
