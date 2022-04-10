package day19;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
       /* 4. Write a program for grade calculator:
        1. Ask the user "Enter your score"
        If user enters invalid score, terminate
        the program after displaying the error message "Invalid Entry"
        2. Display the grade of the student.
        90 ~ 100 ==> A
        80 ~ 89 ==> B
        70 ~ 79 ==> C
        60 ~ 69 ==> D
        0 ~ 59 ==> F
        2. Ask the user would you like to continue
                If "yes" --> repeat the previous steps
        If "no" --> print "Thank you for using
        Cydeo Grade Calculator APP"
        If user enters an invalid entry,
        terminate the program after displaying the error message "Invalid Entry"*/

        Scanner in = new Scanner(System.in);
        int grade;
        while (true){
            grade= in.nextInt();
            if (grade<0||grade>100){
                System.out.println("Invalid Entry!");
                System.exit(0);
            }
           String result= grade>90? "A": grade>80?"B":grade>70?"C":grade>60?"D" :"F";

            System.out.println(result);

            System.out.println("Do you want to continue?");
            String str= in.next().toLowerCase();
            if (!str.equals("no")&&!str.equals("yes")){
                System.out.println("Invalid Entry");
                System.exit(0);
            }
            else if (str.equals("no")){
                System.out.println("Thank you for using Cydeo Grade Calculator APP");
                System.exit(0);
            }
        }
    }
}
