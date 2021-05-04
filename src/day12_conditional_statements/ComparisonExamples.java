package day12_conditional_statements;

public class ComparisonExamples {
    public static void main(String[] args) {

        int speedLimit = 55;
        int currentSpeed = 45;
        System.out.println(currentSpeed > speedLimit);
        System.out.println(speedLimit < speedLimit);
        System.out.println(speedLimit == currentSpeed);

        boolean isSpeeding = currentSpeed > speedLimit;

        System.out.println("Are you speeding? - " + isSpeeding);

        currentSpeed += 20;
        isSpeeding = currentSpeed > speedLimit;

        System.out.println("Are you speeding? - " + isSpeeding);
        System.out.println("currentSpeed = " + currentSpeed);
        System.out.println("speedLimit = " + speedLimit);

        double accountBalance = 250.25;
        double itemPrice = 299.99;
        boolean canAfford = accountBalance >= itemPrice;

        System.out.println("Account balance = " + accountBalance);
        System.out.println("Item price = " + itemPrice);
        System.out.println("Can afford? - " + canAfford);

        accountBalance += 150;
        canAfford = accountBalance >= itemPrice;
        System.out.println("Can afford? - " + canAfford);
        
        accountBalance -= 100;
        canAfford = accountBalance >= itemPrice;
        System.out.println("Account balance = " + accountBalance);
        System.out.println("Item price = " + itemPrice);
        System.out.println("canAfford = " + canAfford);

        accountBalance -= itemPrice;
        
        boolean isBroke = accountBalance <= 0;
        System.out.println("Am I broke? - " + isBroke);
        

    }
}
