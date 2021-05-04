package day15_logicalops_switch_ternary;

public class OrLogicalOperator {
    public static void main(String[] args) {
        System.out.println("true || true = " + (true||true));
        System.out.println("true || false = " + (true||false));
        System.out.println("false || true = " + (false||true));
        System.out.println("false || false = " + (false || false));

        int apples = 5;
        int oranges = 7;

        System.out.println(apples > 3 || oranges > 4);

        if (apples > 3 || oranges > 4) {
            System.out.println("No need to by any fruits today");
        } else {
            System.out.println("Need to get some fruits");
        }

        if (apples > 2 || oranges > 10) {
            System.out.println("Looks like we are good with fruit");
        } else {
            System.out.println("Need to by some fruit");
        }

        if (apples == 0 || oranges == 0) {
            System.out.println("We need to purchase some fruit");
        } else {
            System.out.println("We are good with fruit");
        }
    }
}
