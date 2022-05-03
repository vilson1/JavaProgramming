package day44.animalTask;

public final class Tiger extends Animal implements WildAnimal, Huntable{
    public Tiger(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating tiger food");
    }

    @Override
    public void wild() {

        System.out.println(getName()+" is a wild Animal");
    }

    @Override
    public void huntable() {
        System.out.println(getName()+" is hunting");

    }
}
