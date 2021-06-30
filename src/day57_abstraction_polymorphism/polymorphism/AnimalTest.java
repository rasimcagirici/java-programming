package day57_abstraction_polymorphism.polymorphism;

import java.util.ArrayList;
import java.util.List;

public class AnimalTest {

    public static void main(String[] args) {

        Animal dog = new Dog();
        Animal horse = new Horse();
        Animal cat = new Cat();

        dog.makeNoise();
        horse.makeNoise();
        cat.makeNoise();

        List<Animal> listOfAnimals = new ArrayList<>();
        listOfAnimals.add(new Dog());
        listOfAnimals.add(new Dog());
        listOfAnimals.add(new Horse());
        listOfAnimals.add(new Cat());

        for (Animal each : listOfAnimals) {
            each.makeNoise();
        }

    }

}
