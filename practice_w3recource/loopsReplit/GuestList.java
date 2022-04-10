package loopsReplit;

import java.util.Scanner;

public class GuestList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String guestsList="";
        while (true)
        {
            System.out.println("Please enter guest name:");
            String name= input.next();
            System.out.println("Do you want to enter new guest name:");
            String a= input.next();
            guestsList+=name+", ";
            while (!(a.toUpperCase().equals("YES")||a.toUpperCase().equals("NO")))
            {
                System.err.println("Invalid answer");
                System.out.println("Please enter YES or NO");
                 a= input.next();
            }

            if (a.toUpperCase().equals("NO"))
            {
                break;
            }
        }
        System.out.println("Guest's list: "+guestsList.substring(0,guestsList.length()-2));

    }
}
