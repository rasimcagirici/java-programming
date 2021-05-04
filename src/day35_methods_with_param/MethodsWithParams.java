package day35_methods_with_param;

public class MethodsWithParams {
    public static void main(String[] args) {
        displayValue(10);
        displayValue(100);
        displayValue(1000);
        displayValue(10000);
        displayValue(100000);
        displayValue(1000000);
        displayValue(1000000);
        displayValue(100000);
        displayValue(10000);
        displayValue(1000);
        displayValue(100);
        displayValue(10);
        greetByName("Hello, my name is Rasim");
        greetByName("Rasim");
        String name = "You like that!";
        greetByName(name);

    }
    public static void displayValue(int num) {
        System.out.println("value is " + num);
    }
    public static void greetByName(String name) {
        System.out.println(name);
    }
}
