package day13_conditional_statements;

public class AtmPincodeProgram {
    public static void main(String[] args) {
        System.out.println("**** WELCOME TO TD BANK ATM ***");
        int secretPincode = 3675, inputPincode = 3675;

        if(secretPincode == inputPincode) {
            System.out.println("Welcome to your account");
            System.out.println("You can withdraw money, check balance, or deposit money");
        }else{
            System.out.println("Incorrect pin code! " + inputPincode);
            System.out.println("Please try again.");
        }

        System.out.println("Thank you for using TD Bank ATM!");
    }
}
