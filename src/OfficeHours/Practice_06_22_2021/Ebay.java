package OfficeHours.Practice_06_22_2021;

public class Ebay extends OnlineShopping implements AllowUsersToSell{

    @Override
    public boolean payForShipping(double price) {
        return price < 100;
    }

    @Override
    public void buyItem() {
        System.out.println("Buying Item from Ebay");

    }

    @Override
    public void returnItem() {
        System.out.println("Returning Item to Ebay");

    }

    @Override
    public void uploadProduct() {
        System.out.println("Ebay Seller");
    }

    @Override
    public void viewCart() {
        System.out.println("Viewing Ebay Cart");

    }
}
