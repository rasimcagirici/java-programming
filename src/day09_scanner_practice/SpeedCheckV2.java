package day09_scanner_practice;
import java.util.Scanner;

public class SpeedCheckV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the speed limit?");
        int speedLimit = scan.nextInt();
        System.out.println("What is your current speed?");
        int currentSpeed = scan.nextInt();
        int overTheLimit = currentSpeed-speedLimit;
        System.out.println("You are " + overTheLimit + "mph over the limit, please slow down");
    }
}
