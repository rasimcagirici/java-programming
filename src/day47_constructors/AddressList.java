package day47_constructors;

public class AddressList {
    public static void main(String[] args) {
        Address address = new Address();
        address.setStreet("6A Short Street");
        address.setCity("Lodi");
        address.setState("NJ");
        address.setZipCode("07644");
        System.out.println(address);

        Address secondAdrress = new Address("4535 Kissena Blvd Apt 105", "Flushing", "NY", "11355");
        System.out.println(secondAdrress);
    }
}
