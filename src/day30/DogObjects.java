package day30;

import java.util.ArrayList;
import java.util.Arrays;

public class DogObjects {
    public static void main(String[] args) {

        Dog dog1=new Dog();
        dog1.name="Lucy";
        dog1.bread="Husky";
        dog1.age=3;
        dog1.gender='M';
        dog1.size="Small";
        dog1.color="White";

        System.out.println(dog1);

        Dog dog2=new Dog();
        dog2.name="ACE";
        dog2.bread="Husky";
        dog2.age=5;
        dog2.gender='F';
        dog2.size="Big";
        dog2.color="Black";
        System.out.println(dog2);

        Dog dog3= new Dog();
        dog3.setInfo("Gofi", "Sharr", 2,'M',"Big","Yellow");
        System.out.println(dog3);

        Dog dog4= new Dog();
        dog4.setInfo("Silly", "Pitbull", 2,'F',"Big","Yellow");

        Dog dog5= new Dog();
        dog5.setInfo("Nancy", "Sharr", 2,'F',"Small","White");

        Dog[] dogs={dog1,dog2,dog3,dog4,dog5};

        ArrayList<Dog> femaleDog= new ArrayList<>();
        ArrayList<Dog>  maleDog=new ArrayList<>();

        for (Dog dog : dogs) {
            if (dog.gender=='M')
                maleDog.add(dog);
            else
                femaleDog.add(dog);

        }
        System.out.println("------------------");
        System.out.println(femaleDog);
        System.out.println(maleDog);

        System.out.println("-------------------------------");

        ArrayList<Dog> femaleDog1= new ArrayList<>(Arrays.asList(dogs));
        ArrayList<Dog>  maleDog1=new ArrayList<>(Arrays.asList(dogs));
        femaleDog1.removeIf(p-> p.gender=='M');
        maleDog1.removeIf(p-> p.gender=='F');

        System.out.println(femaleDog1);
        System.out.println(maleDog1);


    }
}
