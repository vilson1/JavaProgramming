package Methods;

import java.util.Scanner;

public class Max {
    public static int max(int x, int max){
        // Code here

        int result;
        if (max>x)
        {
            result=max;
        }
        else
            result=x;

        return result;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(max(in.nextInt(), in.nextInt()));
    }
}
