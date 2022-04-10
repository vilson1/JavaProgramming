package Methods;

import java.util.Scanner;

public class ValidateTask {

        public static boolean validateTask(boolean notEmpty,int taskId,int currentId){
            // your code here

            boolean result=false;
            if (notEmpty){
                if (taskId==currentId+1)
                    result=!result;
            }
            return result;



        }

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println(validateTask(in.nextBoolean(), in.nextInt(), in.nextInt()));
        }
}
