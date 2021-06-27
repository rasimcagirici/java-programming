package day57_abstraction_polymorphism.abstract_class_vs_interface;

public abstract class AbstractA {

    int num1;
    private double price;
    public static int count;
    public final String TYPE = "abstract";
    public static final String LANGUAGE = "java";

    public AbstractA() {
        System.out.println("AbstractA constructor");
    }

    public static void helloM() {
        System.out.println("Hello");
    }

    public abstract void abstractA();

    public String helloN() {
        return "Hello N";
    }
}
