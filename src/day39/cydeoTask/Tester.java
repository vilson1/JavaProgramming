package day39.cydeoTask;

public class Tester extends Employee {
    public Tester(String name, int age, char gender, int employeeId, String jobTitle, double salary) {
        super(name, age, gender, employeeId, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is working");
    }

    public void ticket(){
        System.out.println(getName()+" is creating ticket");
    }


}
