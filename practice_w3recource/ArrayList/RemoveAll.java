package ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveAll {
    //create your method below
public static ArrayList<String> removeAll(ArrayList<String> wordList, String targetWord){

    removeAll(wordList,targetWord);
    return wordList;


}








    // Do not touch below


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        String target = in.next();
        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i < size; i++) {
            list.add(in.next());
        }

        System.out.println(removeAll(list, target));

    }

}
