package day49_static;

public class StaticTest {
    public static void main(String[] args) {
        StaticMethods.displayMessages("Hello There");
        StaticMethods method = new StaticMethods();
        method.instanceMethod();
    }
}
