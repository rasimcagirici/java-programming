package day49_static;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount husband = new BankAccount();
        husband.user = "Husband";
        husband.showBalance();
        husband.spend(15.69);
        husband.showBalance();
        BankAccount wife = new BankAccount();
        wife.user = "Wife";
        wife.showBalance();
        wife.spend(350.31);
        wife.showBalance();
        BankAccount child = new BankAccount();
        child.user = "Child";
        child.showBalance();
        child.spend(134.0);
        child.showBalance();
    }
}
