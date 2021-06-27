package excercises.credit_card_replit;

public class Discover extends CreditCard{
    double apr = 14.35;
    boolean cashback = false;

    public Discover(long nextLong, double nextDouble) {
        super.cardNumber = nextLong;
        super.balance = nextDouble;
    }


    public void useCard() {
        System.out.println("Using Capital One card");
    }

    public void payBalance(double balance) {
        System.out.println("Paying " + balance + " from " + super.balance);
    }

    @Override
    public String toString() {
        return "Capital One credit card | card number: " + cardNumber + " | balance used: " + (super.balance) + " | APR: " + apr + " | has cashback: " + cashback;
    }
}
