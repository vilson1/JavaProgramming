package day17;

import java.util.Scanner;

public class RoomReservation {
    public static void main(String[] args) {
       /* 5. Create a class called RommReservation, write a program for the room
        reservation, your program asks the user wants to reserve a room.
        if user entered yes, then ask which type of room the user
        wants to reserve. if user entered no, print "have a nice day"
        (if user entered any invalid answer (other
                than yes/no) ask user to reenter until user provides a valid entry)
        King Bed ==> 120$
        Queen Bed ==> 100$
        single Bed ==> 80$
        the program should be able to display the room he/she reserved
        and total price of the room.
        (if the user selected an invalid room, ask the user to
        reselect the room until user provides a valid entry)*/

        Scanner in=new Scanner(System.in);
        System.out.println("Do you want to reserve a room?");
        String reserveRoom;
        String roomType;
        int price;

        while (true){
            reserveRoom= in.nextLine().toLowerCase();
            if (reserveRoom.equals("yes") || reserveRoom.equals("no")){
                break;
            }
        }
        if (reserveRoom.equals("no")){
            System.out.println("Have a nice Day");
        }



        while (true){
            System.out.println("Which type of room do you want to reserve?");
            roomType= in.nextLine().toLowerCase();
            if (roomType.equals("king bed")||reserveRoom.equals("single bed")||roomType.equals("queen bed")){
                break;
            }
        }

        if (roomType.equals("king bed"))
            price=120;
        else if (roomType.equals("queen bed"))
            price=100;
        else
            price=80;

        System.out.println("roomType = " + roomType);
        System.out.println("price = $" + price);

    }
}
