package day50_inheritance;

public class StaticBlockDemo {
    static int num;
    static {
        System.out.println("static initializer block");
    }

    public StaticBlockDemo() {
        System.out.println("Constructor method");
    }
}
