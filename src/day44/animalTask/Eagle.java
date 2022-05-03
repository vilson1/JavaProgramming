package day44.animalTask;

public final class Eagle extends Animal implements WildAnimal,Huntable{
    public Eagle(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating Eagle  food");
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
