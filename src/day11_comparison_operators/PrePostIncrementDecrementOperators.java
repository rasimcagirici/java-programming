package day11_comparison_operators;

import com.sun.xml.internal.xsom.XSUnionSimpleType;

public class PrePostIncrementDecrementOperators {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = ++num1;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        int num3 = 8;
        int num4 = num3++;
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);

        int apples = 5;
        int basket = ++apples;

        System.out.println("apples = " + apples);
        System.out.println("basket = " + basket);

        int kiwi = 15;
        int kiwiBasket = kiwi++;
        System.out.println("kiwi = " + kiwi);
        System.out.println("kiwiBasket = " + kiwiBasket);

        int cars = 5;
        System.out.println(++cars);

        int sedans = 10;
        System.out.println(sedans++);
        System.out.println(sedans);

        int myNumber = 44;
        myNumber++;
        System.out.println(myNumber);
        System.out.println(++myNumber);
        System.out.println(myNumber++);
        System.out.println(myNumber);

        int a = 50;
        int b = 22;
        System.out.println(a);
        int c = a++ + ++b;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);


    }
}
