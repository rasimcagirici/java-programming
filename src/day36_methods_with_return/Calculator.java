package day36_methods_with_return;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(add(55.65,60.30));
        double sum = add(1,3);
        System.out.println("sum = " + sum);
        System.out.println("100 + 200  = " + add(100,200));
        System.out.println(minus(24.5,23.5));
        System.out.println(multipy(2,5.5));
        System.out.println(divide(10,2));

    }
    public static double add(double num1, double num2) {
        double sum = num1 + num2;
        return sum;
    }
    public static double minus(double num1, double num2) {
        double result = num1 - num2;
        return result;
    }
    public static double multipy(double num1, double num2) {
        double result = num1 * num2;
        return result;
    }
    public static double divide(double num1, double num2) {
        double result = num1 / num2;
        return result;
    }
}
