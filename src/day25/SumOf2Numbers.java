package day25;

public class SumOf2Numbers {
    public static void main(String[] args) {

       int sum= sumOfNumbers(5,7);
       int sum2=sumOfNumbers(6,3,9);
       int sum3=sumOfNumbers(10,45,6,65);


    }
    public static int sumOfNumbers(int num1,int num2){

        return num1+num2;
    }
    public static int sumOfNumbers(int num1, int num2, int num3){
        return num1+num2+num3;
    }
    public static int sumOfNumbers(int num1, int num2, int num3, int num4){
        return num1+num2+num3+num4;
    }
}
