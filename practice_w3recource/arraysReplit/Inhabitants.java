package arraysReplit;

import java.util.Arrays;
import java.util.Scanner;

public class Inhabitants {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};

        //TODO. Write you code below this line.
        for (int i = 0; i < inhabitants.length; i++) {
            System.out.println("Day "+ i +" "+ Arrays.toString(inhabitants));



        }


    }
}
