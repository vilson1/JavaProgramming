package arraysReplit;

import java.util.Arrays;
import java.util.Scanner;

public class ZombieAttack {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] inhabitants = {input.nextInt(), input.nextInt(), input.nextInt(),
        input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};


              int[] nullArray= new int[inhabitants.length];
              int i=0;
        while (true){
            System.out.println("Day "+i+ " "+ Arrays.toString(inhabitants));
            i++;
            if (Arrays.equals(inhabitants,nullArray))
            {
                System.out.println("---- EXTINCT ---");
                System.exit(0);
            }
            for (int j=0; j<inhabitants.length;j++) {

                inhabitants[j]/=2;

            }
            
        }
    }
}
