package day13_conditional_statements;

public class IfWithBooleanVariable {
    public static void main(String[] args) {
        boolean isHungry = false;

        if(isHungry) {
            System.out.println("I am hungry, I will go get something to eat");
            System.out.println("Then code java");
        } else {
            System.out.println("I'm not hungry, I will keep coding java!");
        }

        double price = 130.44;
        boolean isAffordable = 200 > price;

        if(isAffordable) {
            System.out.println("You can buy the product");
        } else {
            System.out.println("You can't buy the product");

            }
        boolean isRemoteJob = true;

        if(!isRemoteJob) {
            System.out.println("Sorry I am not interested");
        } else {
            System.out.println("Sure, I am interested, what is the interview process?");
        }
        }


    }
