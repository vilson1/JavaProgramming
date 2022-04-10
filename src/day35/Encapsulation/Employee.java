package day35.Encapsulation;

public class Employee {
    private String name;
    private int age;
    private char gender;
    private double salary;

    public Employee(String name, int age, char gender, double salary) {
        setName(name);
        setAge(age);
        setGender(gender);
        setSalary(salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", salary=" + salary +
                '}';
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        if (name.isEmpty()){
            return;
        }
        this.name=name;

    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        if (age<16 && age>150){
            System.err.println("Invalid age!");
            System.exit(0);
        }
        this.age=age;

    }

    public char getGender(){
        return gender;
    }
    public void setGender(char gender){
        if (!(gender=='M' || gender=='F')){
            System.err.println("Invalid gender");
            System.exit(0);
        }
        this.gender=gender;

    }

    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        if (salary<=0){
            System.err.println("Invalid salary");
            System.exit(0);
        }
        this.salary=salary;


    }
}
