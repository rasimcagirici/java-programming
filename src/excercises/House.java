package excercises;

public class House {
    public static void main(String[] args) {
        String houseType = "Two Family";
        int numberOfBedrooms = 6;
        int numberOfBathrooms = 3;
        int numberOfKitchens = 2;
        boolean isThereABasement = true;
        boolean isThereAnAttic = true;
        boolean isThereAPool = true;
        boolean isTheHouseForSale = true;
        int costOfHouse = 450000;
        String address = "415 Mcrip Avenue";
        int zipCode = 10745;
        boolean isAParkNearBy = true;
        int schoolRating = 5;

        System.out.println("The property is a " + houseType + " house");
        System.out.println("There is a total of " + numberOfBedrooms + " bedrooms");
        System.out.println("There is a total of " + numberOfBathrooms + " bathrooms");
        System.out.println("There is a total of " + numberOfKitchens + " kitchens");
        System.out.println("Is there a basement? " + isThereABasement);
        System.out.println("Is there an Attic? " + isThereAnAttic);
        System.out.println("Is there a pool? " + isThereAPool);
        System.out.println("Is the House for sale? " + isTheHouseForSale);
        System.out.println("The house is on sale for $" + costOfHouse);
        System.out.println("The address is " + address);
        System.out.println("The zipcode is " + zipCode);
        System.out.println("Is the house near a park? " + isAParkNearBy);
        System.out.println("The schools in the district have a rating of 5 out of " + schoolRating);
    }
}
