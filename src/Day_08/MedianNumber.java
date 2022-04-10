package Day_08;
import  java.util.Scanner;
public class MedianNumber {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int nr1, nr2, nr3;

        System.out.println("add 3 numbers");
        nr1 = in.nextInt();
        nr2 = in.nextInt();
        nr3 = in.nextInt();

        if (nr1 > nr2 && nr1 < nr3 || nr1 > nr3 && nr1 < nr2) {
            System.out.println(nr1 + " is the median number");
        } else if (nr2 > nr1 && nr2 < nr3 || nr2 > nr3 && nr2 < nr1) {
            System.out.println(nr2 + " is the median number");
        } else if (nr3 > nr1 && nr3 < nr2 || nr3 > nr2 && nr3 < nr1)
        {
            System.out.println(nr3 + " is the median number");
        }

        else
            System.out.println("at least 2 numbers are equal");





    }

}
