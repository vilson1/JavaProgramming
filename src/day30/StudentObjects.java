package day30;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentObjects {
    public static void main(String[] args) {
        Student student1= new Student();
        student1.setInfo("Vilson",'M', 30,1,'A');



        Student student2= new Student();
        student2.setInfo("Fation",'M', 30,2,'B');

        Student student3= new Student();
        student3.setInfo("Lana",'F', 38,3,'A');

        Student student4= new Student();
        student4.setInfo("Saadet",'F', 48,4,'B');

        Student student5= new Student();
        student5.setInfo("Rezi",'F', 28,5,'C');

        Student[] students={student1,student2,student3,student4,student5};

        for (Student student : students) {
            System.out.println(student);

        }

        ArrayList<Student> earlyBirds= new ArrayList<>(Arrays.asList());
        ArrayList<Student> angryBirds= new ArrayList<>(Arrays.asList());

        for (Student student : students) {
            if (student.grade=='A')
                earlyBirds.add(student);
            else
                angryBirds.add(student);

        }
        System.out.println("---------------------------------------");
        System.out.println(earlyBirds);
        System.out.println(angryBirds);

        System.out.println("-----------------------------------------------");

      ArrayList<Student> earlybird1=new ArrayList<>(Arrays.asList(students));
        ArrayList<Student> angrybird1=new ArrayList<>(Arrays.asList(students));

        earlybird1.removeIf(p->!(p.grade=='A'));
        angrybird1.removeIf(p->p.grade=='A');

        System.out.println(earlybird1);
        System.out.println(angrybird1);

    }
}
