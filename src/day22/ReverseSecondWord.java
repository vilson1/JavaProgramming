package day22;

import java.util.Arrays;

public class ReverseSecondWord {
    public static void main(String[] args) {
        String sentence="I love Java";
        String[] word=sentence.split(" ");
        String revers="";
        for (int i = word[1].length()-1; i >=0; i--) {
            revers+=word[1].charAt(i);

        }
        word[1]=revers;
        System.out.println(Arrays.toString(word));
        for (String s : word) {
            System.out.print(s+" ");

        }
    }
}
