package day15_logicalops_switch_ternary;

public class NotLogicalOperator {
    public static void main(String[] args) {
        int age = 20;

        if (!(age > 7)) {
            System.out.println("Need to sit in car seat");
        } else {
            System.out.println("Don't need to sit in car seat");
        }

        boolean isSmokingAllowed = true;

        if(!(isSmokingAllowed)) {
            System.out.println("Smoking is not allowed here. Exit.");
        } else {
            System.out.println("This area is for Smoking");
        }

        boolean isAffordable = true;

        if(!(isAffordable)) {
            System.out.println("Item not affordable");
        } else {
            System.out.println("Item is affordable");
        }

        String env = "qa";
        if(!env.equals("qa")) {
            System.out.println("In wrong enivronment ofr QA testing");
        }

        String carModel = "Tesla";
        if(!carModel.equals("Tesla")) {
            System.out.println("Not interested");
        }

        String secretPassword = "abc123";
        String inputPassword = "abc321";

        if(!inputPassword.equals(secretPassword)) {
            System.out.println("Incorrect password");
        } else {
            System.out.println("Correct password");
        }


    }
}
