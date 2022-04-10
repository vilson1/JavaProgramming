package Day18;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String username = "Cydeo";
        String password = "WoodenSpoon";




        for (int i = 0; i <3 ; i++) {
            System.out.println("Enter your Credentioals");
            String user = in.next();
            String pass = in.next();
            if (username.equals(user) && password.equals(pass))
            {
                System.out.println("Loged In");
                break;
            }
            System.err.println("username or password is incorrect");
            if (i==2)
            {
                System.out.println("Your account is Blocked");
            }
        }


    }
}
