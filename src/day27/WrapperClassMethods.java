package day27;

public class WrapperClassMethods {
    public static void main(String[] args) {
        String str="1234";

        int num=Integer.parseInt(str);
        System.out.println(num+1);
        System.out.println(str+1);

        String str2="10.5";

        double num2=Double.parseDouble(str2);
        System.out.println(num2+1);

        int max=Integer.MAX_VALUE;
        int min=Integer.MIN_VALUE;
        System.out.println(max);
        System.out.println(min);


        System.out.println("------------------------------");

        char ch='0';
        boolean r2=Character.isDigit(ch);
        System.out.println(r2);
    }
}
