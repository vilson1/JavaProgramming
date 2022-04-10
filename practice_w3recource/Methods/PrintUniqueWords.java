package Methods;

import java.util.Scanner;

public class PrintUniqueWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        String[] words = new String[size];
        for(int i=0; i < size; i++){
            words[i] = scan.next();
        }
        printUniqueWords(words);
    }

    public static void printUniqueWords(String[] words){
        //WRITE YOUR CODE HERE

        String dublicated="";
        int count=0;
        for (int i = 0; i < words.length; i++) {

            for (String word : words) {
                if (words[i].equals(word))

                    count++;
            }
            if (count==1)
                dublicated+=words[i]+",";
            count=0;

        }
        String[] arr1=dublicated.split(",");
        for (String s : arr1) {
            System.out.println(s);

        }

    }
}
