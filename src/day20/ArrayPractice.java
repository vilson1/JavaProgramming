package day20;

import java.util.Arrays;

public class ArrayPractice {
    public static void main(String[] args) {
        char[] letters=new char[26];
        for (int i = 0; i < 26; i++) {
            for (char j = 'A'; j <='Y'; j++) {
                letters[i] = j;
                  break;
            }
        }
        System.out.println(Arrays.toString(letters));
    }
}
