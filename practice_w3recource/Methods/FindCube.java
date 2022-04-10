package Methods;

import java.util.Scanner;

public class FindCube {

    //your code here
     public static void cube(){
         Scanner in = new Scanner(System.in);
         int number= in.nextInt();
         int numberCube=number*number*number;
         System.out.println(numberCube);
     }



    //end cube

    public static void main(String[] args) {

        cube();

    }
}
