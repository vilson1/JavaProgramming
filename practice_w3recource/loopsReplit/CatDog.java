package loopsReplit;
import java.util.Scanner;

public class CatDog {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfCats = 0;
        int countOfDogs = 0;
        String word = scan.next();

        while (word.contains("cat")||word.contains("dog"))
        {
            while (word.contains("cat"))
            {
                word=word.replaceFirst("cat"," ");
                countOfCats++;
            }
            while (word.contains("dog"))
            {
                word=word.replaceFirst("dog"," ");
                countOfDogs++;
            }

        }
        if (countOfCats==countOfDogs)
        {
            System.out.println("true");
        }
        else
            System.out.println("false");
    }
}
