package loopsReplit;
import java.util.Scanner;
public class Inhabitats {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();
        int count=0;

        do {
            if (inhabitants==0)
            {

                break;
            }
            System.out.println("Day "+count+" ["+inhabitants+"]");
            inhabitants=inhabitants/2;
            count++;
        }while (inhabitants>0);
        System.out.println("---- EXTINCT ----");
    }
}
