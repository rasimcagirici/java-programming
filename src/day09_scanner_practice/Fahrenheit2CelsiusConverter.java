package day09_scanner_practice;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Fahrenheit2CelsiusConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many fahrenheit is it:");
        double fahrenheit = scan.nextDouble();
        double celsius = (fahrenheit-32)*5/9;
        System.out.println("It is " + celsius + " celsius outside");
    }
}
