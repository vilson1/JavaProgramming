package day35;

public class Person {
    public String name;
    public int age;
    public char gender;
    public String language;
    public static String planet;
    public static boolean isHuman, hasNose;
    public static int numberOfWings, numberOfHead;

    public Person(String name, int age, char gender, String language) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.language = language;
    }

    static {
        planet="Earth";
        isHuman=true;
        hasNose=true;
        numberOfWings=0;
        numberOfHead=1;

    }

    public static void printPlanet(){
        System.out.println("Planet name is "+planet);
    }

    public void eat(){
        System.out.println(name+" is eating");
    }

    public void drink(){
        System.out.println(name+" is drinking");
    }


    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", language='" + language + '\'' +
                "plane "+ planet+
                '}';
    }
}
