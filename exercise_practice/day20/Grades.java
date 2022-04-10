package day20;

import java.util.Arrays;

public class Grades {
    public static void main(String[] args) {
       /* 4. given the following arrays:
        String [] names = {"Anna", "Nancy", "Sarah"};
        int [] scores = {90, 75, 80};
        char [] grades = new char[names.length];
        1. write a program that can store the grades of the students in
        the array named grades
        2. print the grade report of each students in separate lines*/

        String [] names = {"Anna", "Nancy", "Sarah"};
        int [] scores = {90, 75, 80};
        char [] grades = new char[names.length];
        int i=0;
        for (int score : scores) {
            char grade=score>90? 'A':score>80?'B':score>70?'C':score>60?'D':'F';
            grades[i]=grade;
            i++;
        }

        for (int j = 0; j < names.length; j++) {
            System.out.println(names[j]+"'s score is "+ scores[j]+", and grade is "+grades[j]);

        }
    }
}
