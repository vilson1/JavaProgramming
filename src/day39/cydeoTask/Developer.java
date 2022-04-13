package day39.cydeoTask;

public class Developer extends Employee{
    public Developer(String name, int age, char gender, int employeeId, String jobTitle, double salary) {
        super(name, age, gender, employeeId, jobTitle, salary);
    }


    @Override
    public void work() {
        System.out.println(getName()+" is working");
    }

    public void fixBugs(){
        System.out.println(getName()+" is fixing the bugs");
    }
}
