package day44_custom_classes;

public class AnimalObjects {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.type = "some animal";
        System.out.println(animal.type);
        animal.eat();
        animal.eat("grass");
        animal.speak("Hello");
        animal.speak();
        Animal cheetahObj = new Animal();
        cheetahObj.type = "Cheetah";
        System.out.println(cheetahObj.type);
        cheetahObj.eat("meat");
        cheetahObj.speak("Roar");
    }
}
