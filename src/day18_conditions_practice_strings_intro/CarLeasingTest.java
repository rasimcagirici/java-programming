package day18_conditions_practice_strings_intro;

public class CarLeasingTest {
    public static void main(String[] args) {
        String make = "Toyota";
        String model = "A3";
        double leasePrice = 0;

        if (make.equals("Mercedes")) {
            if (model.equals("E")) {
                leasePrice = 500.0;
            } else if (model.equals("A")) {
                leasePrice = 400.0;
            }
        }
        if (make.equals("Audi")) {
                if (model.equals("SQ5")) {
                    leasePrice = 552.0;
                } else if (model.equals("A3")) {
                    leasePrice = 412.0;
                }
        } else {
            System.out.println("Invalid Car Make or Model");
            return;
        }

        System.out.println("Car Make = " + make);
        System.out.println("Car model = " + model);
        System.out.println("Lease price = " + leasePrice);
    }
}
