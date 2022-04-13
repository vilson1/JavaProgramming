package day39.cydeoTask;

public class Cydeo {
    public static void main(String[] args) {
        Tester tester=new Tester("Vilson",30,'M',1234,"QA",123456);
        Developer developer=new Developer("Fation",29,'M',456,"Developer",345678);
        Teacher teacher=new Teacher("fghj",45,'F',4567,"Math Teacher",4569);
        Student student=new Student("Ali",25,'M',456,"SDet");

        System.out.println(teacher);
        System.out.println(tester);
        System.out.println(developer);
        System.out.println(student);
    }
}
