package day15_logicalops_switch_ternary;

public class UsedCarSelector {
    public static void main(String[] args) {
        double budget = 5000;
        String model = "Honda";
        double carPrice = 6000;

        if(carPrice <= budget && (model.equals("Toyota") || model.equals("Honda") || model.equals("Tesla"))) {
            System.out.println("Let's go buy the car");
        } else {
            System.out.println("Let's not buy the car");
        }
    }
}
