package day37_methods_overloading;

public class MethodOverloading {
    public static void main(String[] args) {
        System.out.println(sum(5,10));
        System.out.println(sum(5,10,15));
        System.out.println(sum(5.5,10.5));
        System.out.println(sum("Hello","World"));
    }
    public static int sum(int a, int b) {
        return a+b;
    }
    public static int sum(int a, int b, int c) {
        return a+b+c;
    }
    public static double sum(double a, double b) {
        return a+b;
    }
    public static String sum(String a, String b) {
        return a + " " + b;
    }
}
