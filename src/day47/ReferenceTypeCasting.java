package day47;

import day44.animalTask.Animal;
import day44.animalTask.Dog;
import day45.shapesTask.Circle;
import day45.shapesTask.Shape;

public class ReferenceTypeCasting {
    public static void main(String[] args) {
        Shape shape=new Circle(4); //upcasting

        Animal animal=new Dog("dog","idk",'M',34,"big","Blue");

    }
}
