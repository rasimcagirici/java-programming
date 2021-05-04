package day12_conditional_statements;
import java.util.Scanner;

public class AmazonFreeShipping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter total price:");
        int totalPrice = scan.nextInt();

        if(totalPrice>=25) {
            System.out.println("Free Shipping Eligible. Your order total: $" + totalPrice + " dollars");
        }else{
            System.out.print("Not eligible for free shipping.");
            System.out.println(" Your total is $" + totalPrice + " dollars. " + "It is less than the minimum of $25 dollars.");
        }

        System.out.println("THANKS FOR SHOPPING WITH AMAZON");

    }
}
