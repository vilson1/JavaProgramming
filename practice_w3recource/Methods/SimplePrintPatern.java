package Methods;

public class SimplePrintPatern {



    public static void printHollowRect(){
        // write your codes here

        for (int i = 0; i < 5; i++) {
            if (i>0 && i<4)
                System.out.println("*   *");

            else
                System.out.println("*****");

        }


    }

    public static void main(String[] args) {
        printHollowRect();
    }
}
