package day35.Encapsulation;

public class PersonObject {
    public static void main(String[] args) {
        Person person1= new Person();
        person1.setName("Vilson");
        person1.setAge(30);

        System.out.println("Name " + person1.getName()+" Age "+person1.getAge() );
    }
}
