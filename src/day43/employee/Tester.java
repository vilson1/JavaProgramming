package day43.employee;

public final class  Tester extends Employee{


    public Tester(String name, int age, char gender, int employeeId, String jobTitle, double salary) {
        super(name, age, gender, employeeId, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is testing");
    }

    @Override
    public void sleep() {

        System.out.println(getName()+" is sleeping");
    }

    @Override
    public void eat() {

        System.out.println(getName()+" is eating");
    }

    public void bugReport(){
        System.out.println(getName()+" is reporting a bug");
    }
}
