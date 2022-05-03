package day44.animalTask;

public final class Parrot extends Animal implements Playable{
    public Parrot(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating parrot food");
    }

    @Override
    public void play() {
        System.out.println(getName()+" is playing");
    }
}