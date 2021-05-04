package day06_arithmetic_operators;

public class CarDriverInfo {
    public static void main(String[] args){
        String carModel = "Volkswagen", driverName = "Rasim Cagirici";
        int licenseNum = 895456782;
        byte speed = 65;
        boolean isAutomatic = true;
        char licenseClass = 'D';

        System.out.println("The car's model is " + carModel);
        System.out.println("The name of the driver is " + driverName);
        System.out.println("The speed the driver is current driving at is " + speed + "\nThe driver's license number is " + licenseNum);
        System.out.println("The license class is " + licenseClass);
    }
}
