package day43.employee;

public final class Teacher extends Employee {

    public Teacher(String name, int age, char gender, int employeeId, String jobTitle, double salary) {
        super(name, age, gender, employeeId, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is riding the car");
    }

    @Override
    public void sleep() {

        System.out.println(getName()+" is sleeping 9 hours");
    }

    @Override
    public void eat() {

        System.out.println(getName()+" is eating junk food");
    }
}
