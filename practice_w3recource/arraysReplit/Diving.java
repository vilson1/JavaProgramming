package arraysReplit;

import java.util.Arrays;
import java.util.Scanner;

public class Diving {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float[] score = new float[7];
        //WRITE YOUR CODE HERE
        double degreeOfDifficulty;
        float sumPoints=0;
        float total;
        for (int i = 0; i < 7; i++) {
            System.out.println("Enter score for judge "+(i+1)+":");
            score[i]=input.nextFloat();

        }
        System.out.println("Enter difficulty:");
        degreeOfDifficulty=input.nextDouble();
        Arrays.sort(score);
        float[] remainingArray=Arrays.copyOfRange(score,1,score.length-1);
        for (float v : remainingArray) {
            sumPoints+=v;

        }
        total=(float)(degreeOfDifficulty*sumPoints*0.6);


        // FINAL OUTPUT
        System.out.printf("Total: %.2f", total);

    }
}
