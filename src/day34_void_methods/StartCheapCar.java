package day34_void_methods;

public class StartCheapCar {
    public static void main(String[] args) {
        seatInCar();
        startCar();
        shiftToDrive();
        pressGasPedal();
    }
    public static void seatInCar() {
        System.out.println("1. Open door and sit in driver seat.");
    }
    public static void startCar() {
        System.out.println("2. Insert key to ignition and turn clockwise.");
    }
    public static void shiftToDrive() {
        System.out.println("3. Press brake pedal and shift lever to 'D'.");
    }
    public static void pressGasPedal() {
        System.out.println("4. Hold steering wheel with 2 hands and press gas pedal");
    }
}
