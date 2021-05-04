package day36_methods_with_return;

public class Calculation {
    public static void main(String[] args) {
        System.out.println("10 + 45 = " + Calculator.add(10,45));
        System.out.println("100 - 40 = " + Calculator.minus(100,40));
        System.out.println("55 / 4 = " + Calculator.divide(55,4));
        System.out.println("10 * 2 = " + Calculator.multipy(10,2));

        double d1 = 243.3;
        double d2 = 143.3;
        System.out.println(d1 + " + " + d2 + " = " + Calculator.minus(d1,d2));

    }
}
