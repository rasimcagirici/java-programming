package day10_shorthand_operators;

public class ChangeBalance {
    public static void main(String[] args) {
        double balance = 1230.55;
        System.out.println("balance = " + balance);

        double baklava = 22.50;
        System.out.println("baklava = " + baklava);

        balance = balance - baklava;
        System.out.println("balance after baklava = " + balance);

        double kenafa = 44.45;
        System.out.println("kenafa = " + kenafa);

        balance = balance - kenafa;
        System.out.println("balance after kenafa = " + balance);

        kenafa = kenafa / 2;
        System.out.println("kenafa after discount = " + kenafa);

        balance = balance - kenafa;
        System.out.println("balance after second kenafa = " + balance);

        double pilav = 7.99;
        System.out.println("pilav = " + pilav);

        balance = balance - pilav;
        System.out.println("balance after pilav = " + balance);

        double iceTea = 3.0;
        System.out.println("iceTea = " + iceTea);

        balance = balance - iceTea * 4;
        System.out.println("balance after 4 ice teas = " + balance);

        balance += baklava;
        System.out.println("balance after returing baklava = " + balance);
    }
}
