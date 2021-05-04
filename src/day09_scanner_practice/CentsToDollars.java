package day09_scanner_practice;
import java.sql.SQLOutput;
import java.util.Scanner;

public class CentsToDollars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter cents:");
        int cents = scan.nextInt();
        System.out.println("Enter dollars");
        int dollars = scan.nextInt();
        int remainingCents = cents%(dollars*100);
        System.out.println("There are " + remainingCents + " cents left.");

    }
}
