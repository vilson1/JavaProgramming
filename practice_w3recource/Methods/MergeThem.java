package Methods;

import java.util.Scanner;

public class MergeThem {
    public static String mergeStrings(String one, String two) {

        String result="";
       if (one.length()>two.length()){
           for (int i = 0,j=0; i < two.length(); i++,j++) {
               result+=""+one.charAt(i)+two.charAt(j);
           }
           result+=one.substring(two.length());
       }
       else if (one.length()<two.length()){
           for (int i = 0,j=0; j < one.length(); i++,j++) {
               result+=""+one.charAt(i)+two.charAt(j);
           }
           result+=two.substring(one.length());
       }
       else {
           for (int i = 0,j=0; j < one.length(); i++,j++) {
               result+=""+one.charAt(i)+two.charAt(j);
           }

       }

       return result;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(mergeStrings(in.next(), in.next()));
    }
}
