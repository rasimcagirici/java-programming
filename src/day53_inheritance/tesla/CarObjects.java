package day53_inheritance.tesla;

public class CarObjects {
    public static void main(String[] args) {

        ElectricCar ec1 = new ElectricCar("Tesla","Model Y", 48190.0,2021,326);
        ec1.drive(50);
        System.out.println(ec1);
        System.out.println("ec1 make = " + ec1.getMake());
        System.out.println("ec1 model = " + ec1.getModel());
        System.out.println("ec1 price = " + ec1.getPrice());
        System.out.println("ec1 year " + ec1.getYear());
        System.out.println("ec1 range " + ec1.getRange());
        System.out.println("Electric car count " + ec1.count);

        ElectricCar ec2 = new ElectricCar("Tesla", "Cybertruck", 694352.0,2022,450);
        ec2.drive(100);
        System.out.println(ec2);
        System.out.println("Electric car count " + ec2.count);

        Roadster roadster = new Roadster("Roadster", 200000,2022,620);
        roadster.drive(1000);
        roadster.drive(600);
        System.out.println(roadster);
        System.out.println("Electric car count " + roadster.count);

        ModelX modelX = new ModelX("Tesla","Model X", 119990,2021,330);
        modelX.drive(100);
        System.out.println(modelX);
        System.out.println("Electric car count " + modelX.count);

    }
}
