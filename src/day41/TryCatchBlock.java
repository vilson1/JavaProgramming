package day41;

public class TryCatchBlock {
    public static void main(String[] args) {
        System.out.println("Test Started");

        try {

            System.out.println(9/0);
        }
        catch (ArithmeticException e){
            System.out.println("catch block ");
            System.out.println("Arithmetic exception accurred");

        }


        System.out.println("Test completed");

        System.out.println("Test 2");

        int[] arr={1,2,3,4,5};

        try {
            System.out.println(arr[100]);
        }
        catch (ArrayIndexOutOfBoundsException e ){
           // e.printStackTrace();
            System.out.println(e.getMessage());
        }



        System.out.println("Test 2 finished");
    }
}
