package loopsReplit;

import java.util.Scanner;

public class RepeatSeperator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String separator = scan.next();
        int count = scan.nextInt();
        String repeat="";

        while (count>0)
        {
            if (count==1)
            {
                repeat+=word;
                break;
            }
            repeat += word+separator;
            count--;
        }
        System.out.println(repeat);
    }
}
