package Day28;

import java.util.Scanner;

public class StrongPassword {
    public static void main(String[] args) {
        //Verify if a given password is a strong password.
        //1. should have at least 8 characters and no space
        //2. should contain at least one upper case
        //3. should contain at least one lowes case.
        //4. should contain at least one special character.
        //5. should contain at least one digit.


       String password ="Vilson@123";
       boolean r1=password.length()>=8;
       boolean r2=false;
       boolean r3=false;
       boolean r4=false;
       boolean r5=false;

       char[] ch=password.toCharArray();

        for (char each : ch) {
            if (Character.isUpperCase(each)){
                r2=true;
            }
            else  if (Character.isLowerCase(each)){
                r3=true;
            }

            else if (Character.isDigit(each)){
                r5=true;
            }
            else
                r4=true;

        }

        boolean isPaswwordStrong=r1&& r2 && r3 && r4 && r5;
        System.out.println(isPaswwordStrong);


    }




}
