package day30;

public class Dog {

    public String name;
    public String bread;
    public int age;
    public char gender;
    public String size;
    public String color;


    public void setInfo(String dogName, String dogBread, int dogAge, char dogGernder, String dogSize, String dogColor){

        name=dogName;
        bread=dogBread;
        age=dogAge;
        gender=dogGernder;
        size=dogSize;
        color=dogColor;
    }


    public void eat(){
        System.out.println(name+" is eating");
    }
    public void bark(){
        System.out.println(name+" is barking");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", bread='" + bread + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
