package day09_scanner_practice;

public class SpeedCheckV1 {
    public static void main(String[] args) {
        int speed = 55;
        int currentSpeed = 75;
        int overTheLimit = currentSpeed-speed;
        System.out.println("You are " + overTheLimit + "mph over the speed limit.");
    }
}
