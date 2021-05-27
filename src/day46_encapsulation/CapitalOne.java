package day46_encapsulation;

public class CapitalOne {
    public static void main(String[] args) {
        CheckingAccount person1 = new CheckingAccount();
        person1.setAccountHolder("Rasim Cagirici");
        person1.setAccountNumber(4538072753434l);
        person1.setBalance(4743892.67);
        System.out.println(person1);
    }
}
