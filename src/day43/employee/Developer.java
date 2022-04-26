package day43.employee;

public class Developer extends Employee{

    public Developer(String name, int age, char gender, int employeeId, String jobTitle, double salary) {
        super(name, age, gender, employeeId, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is working");
    }

    @Override
    public void sleep() {

        System.out.println(getName()+" is sleeping 6 hours");
    }

    @Override
    public void eat() {

        System.out.println(getName()+" is eating");
    }
}
