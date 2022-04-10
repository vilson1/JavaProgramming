package loopsReplit;

import java.util.Scanner;

public class EqualsJavaPython {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        int countJava=0, countPython=0;
        sentence=sentence.toUpperCase();

        while (sentence.contains("JAVA")||sentence.contains("PYTHON")) {
            if (sentence.contains("JAVA")) {
               sentence= sentence.replaceFirst("JAVA", "");
                countJava++;

            }
            if (sentence.contains("PYTHON")) {
                sentence=sentence.replaceFirst("PYTHON", "");
                countPython++;

            }
        }
            if (countJava==countPython)
                System.out.println("true");
            else
                System.out.println("false");





    }
}
