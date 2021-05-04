package day09_scanner_practice;
import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the hourly rate?");
        double hourlyRate = scan.nextDouble();
        double weeklyRate = hourlyRate*40;
        double monthlyRate = weeklyRate*4;
        double annualPay = monthlyRate*12;
        System.out.println("What is the weekly pay? " + weeklyRate);
        System.out.println("What is the monthly pay? " + monthlyRate);
        System.out.println("What is your annual pay? " + annualPay);

    }
}
