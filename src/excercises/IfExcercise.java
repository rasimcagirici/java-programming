package excercises;

import java.util.Scanner;

public class IfExcercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String item = scan.next();
        int itemPrice = scan.nextInt();
        int giftCard = 100;

        if (item.equals("Blanket") && itemPrice < giftCard) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (giftCard - itemPrice) + "$");
        } else if (item.equals("Charger") && itemPrice < giftCard) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (giftCard - itemPrice) + "$");
        } else if(item.equals("Hat") && itemPrice < giftCard) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (giftCard - itemPrice) + "$");
        } else if (item.equals("Headphones") && itemPrice < giftCard) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (giftCard - itemPrice) + "$");
        } else if (item.equals("Laptop") && itemPrice < giftCard) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (giftCard - itemPrice) + "$");
        } else if (item.equals("Pants") && itemPrice < giftCard) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (giftCard - itemPrice) + "$");
        } else if (item.equals("Pillow") && itemPrice < giftCard) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (giftCard - itemPrice) + "$");
        } else if (item.equals("Smartphone") && itemPrice < giftCard) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (giftCard - itemPrice) + "$");
        } else if (item.equals("Socks") && itemPrice < giftCard) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (giftCard - itemPrice) + "$");
        } else if (item.equals("USB cable") && itemPrice < giftCard) {
            System.out.println("Thank you for your purchase!");
            System.out.println("Your current balance is: " + (giftCard - itemPrice) + "$");
        } else if (itemPrice > giftCard) {
            System.out.println("Sorry, not enough funds on your gift card!");
        } else {
            System.out.println("Invalid item!");
        }
    }
}
