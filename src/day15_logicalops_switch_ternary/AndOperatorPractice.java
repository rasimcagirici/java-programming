package day15_logicalops_switch_ternary;

public class AndOperatorPractice {
    public static void main(String[] args) {
        boolean onSale = true;
        boolean freeShipping = true;
        String itemName = "PlayStation 5";

        if(onSale && freeShipping && itemName.equals("PlayStation 5")) {
            System.out.println("Add " + itemName + " to cart");
        } else {
            System.out.println("Continue shopping");
        }
    }
}
