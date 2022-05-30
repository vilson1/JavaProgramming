package utilities;

public class MathUtility {
    //Create a method that can return the sum of two integers

    public int sumOfTwoNumbers(int num1, int num2){
        int sum=num1+num2;
        return sum;

    }
    //Create a method that can return the sum of two decimal numbers

    public double sumOfTwoNumbers(double num1, double num2){
        double sum=num1+num2;
        return sum;

    }

    //Create a method that can return the subtraction of two integers
    public int subtractOfTwoNumbers(int num1, int num2){
        int sum=num1-num2;
        return sum;

    }

    //Create a method that can return the subtraction of two decimals

    public double subtractionOfTwoNumbers(double num1, double num2){
        double sum=num1-num2;
        return sum;

    }

    //Creata a method that can return the multiplication of two integers
    public int multiplicationOfTwoNumbers(int num1, int num2){
        int sum=num1*num2;
        return sum;

    }

    //Creata a method that can return the multiplication of two decimals
    public double multiplicationOfTwoNumbers(double num1, double num2){
        double sum=num1*num2;
        return sum;

    }

    //Create a method that passes two double parameters and return the division reslt

    public double divisionOfTwoNumbers(double num1, double num2){
        double sum=num1/num2;
        return sum;

    }

    //Create a method that can check if an integer is even number

    public boolean isEven(int num){
        boolean result;
        if (num%2==0){
            result=true;
        }
        else result=false;
        return result;
    }

    //Create a method that can check if an integer is odd number

    public boolean isOdd(int num){
        boolean result;
        if (num%2==0){
            result=false;
        }
        else result=true;
        return result;
    }

    //Create a method that can return the maximum number between two integers

    public int maxNumber(int num1, int num2){
        int result;
        if (num1>=num2){
            result=num1;
        }
        else result=num2;
        return result;
    }

    //Create a method that can return the maximum number between two decimal numbers

    public double maxNumber(double num1, double num2){
        double result;
        if (num1>=num2){
            result=num1;
        }
        else result=num2;
        return result;
    }

    // Create a method that can return the minimum number between two integers

    public int minNumber(int num1, int num2){
        int result;
        if (num1>=num2){
            result=num2;
        }
        else result=num1;
        return result;
    }

    //Create a method that can return the minimum number between two decimal numbers

    public double minNumber(double num1, double num2){
        double result;
        if (num1>=num2){
            result=num2;
        }
        else result=num1;
        return result;
    }

    //Create a method that can return the square of an integer

    public int squareOfNumber(int num){
        return num*num;
    }

    //Create a method that can return the square of a double
    public double squareOfNumber(double num){
        return num*num;
    }

    //Create a method that can return the cube of an integer

    public int cubeOfNumber(int num){
        return num*num*num;
    }

    //Create a method that can return the cube of a double
    public double cubeOfNumber(double num){
        return num*num*num;
    }


}
