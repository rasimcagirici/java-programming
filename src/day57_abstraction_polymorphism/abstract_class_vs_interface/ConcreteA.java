package day57_abstraction_polymorphism.abstract_class_vs_interface;

public class ConcreteA extends AbstractA implements InterfaceA, InterfaceB {

    @Override
    public void abstractA() {

    }

    @Override
    public String helloN() {
        return "Hello N";
    }

    public static void helloM() {
        System.out.println("Hello M");
    }

    @Override
    public void absMethodD(int num) {
        System.out.println("Abstract method");

    }
}
