package day45_oop;

public class CoffeeTest {
    public static void main(String[] args) {
        Coffee myCoffee = new Coffee();
        myCoffee.refill();
        System.out.println("Amount after refill = " + myCoffee.getAmount());
        myCoffee.drink(40);
        myCoffee.setType("turkish coffee");
        System.out.println("Amount after drinking " + myCoffee.getType() + " = " + myCoffee.getAmount());

        Coffee coffee1 = new Coffee();
        coffee1.setType("cappuccino");
        System.out.println("coffee1 type = " + coffee1.getType());
        Coffee coffee2 = coffee1;
        System.out.println("coffee2 type = " + coffee2.getType());
        coffee2.setType("Espresso");
        Coffee coffee3 = new Coffee();
        coffee3.setType("Frappucino");

    }
}
