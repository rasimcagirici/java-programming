package excercises.credit_card_replit;

public class Chase extends CreditCard{
    double apr = 10.99;
    boolean cashback = true;

    public Chase(long nextLong, double nextDouble) {
        super.cardNumber = nextLong;
        super.balance = nextDouble;
    }


    public void useCard() {
        System.out.println("Using Chase card");
    }

    public void payBalance(double balance) {
        System.out.println("Paying " + balance + " from " + super.balance);
    }

    @Override
    public String toString() {
        return "Chase credit card | card number: " + cardNumber + " | balance used: " + super.balance + " | APR: " + apr + " | has cashback: " + cashback;
    }
}
