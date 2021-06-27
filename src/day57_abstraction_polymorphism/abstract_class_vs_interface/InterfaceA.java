package day57_abstraction_polymorphism.abstract_class_vs_interface;

public interface InterfaceA {

    void absMethodD(int num);

    static void staticMethodE(String str) {
        System.out.println("staticMethodE is called with str - " + str); // Starting from java 8
    }

    default void defaultMethodF() { // Starting from java 8
        System.out.println("defaultMethodF is called");
    }
}
