package day13;

import java.util.Scanner;

public class LyWord {
    public static void main(String[] args) {
        /*2. ask the user to enter a word. if the word ends with "ly", print
        "really???" ,  otherwise, print "never mind"*/
        Scanner in =new Scanner(System.in);
        System.out.println("Ender a word");
        String w= in.next();

        if (w.substring(w.length()-2).equals("ly"))
            System.out.println("really???");
        else
            System.out.println("Never mind");

    }
}
