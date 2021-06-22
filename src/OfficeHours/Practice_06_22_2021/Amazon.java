package OfficeHours.Practice_06_22_2021;

public class Amazon extends OnlineShopping implements AllowUsersToSell{

    @Override
    public boolean payForShipping(double price) {
        return price < 50;
    }

    @Override
    public void buyItem() {
        System.out.println("Buying from Amazon");

    }

    @Override
    public void returnItem() {
        System.out.println("Running to Amazon");

    }

    @Override
    public void viewCart() {
        System.out.println("Viewing Amazon Cart");
    }

    @Override
    public void uploadProduct() {

    }
}
