package day05_primitive_concatenation;

public class CellPhone {
    public static void main(String[] args){
        String brand = "Apple";
        String model = "iPhone 11 Max Pro";
        String color = "Space Grey";
        double price = 1299.99;
        int storage = 256;
        boolean hasCamera = true;

        System.out.println(brand);
        System.out.println(model);
        System.out.println(color);
        System.out.println(price);
        System.out.println(storage + "GB");
        System.out.println(hasCamera);
        //WITH MESSAGE
        System.out.println("Brand is " + brand);
        System.out.println("Model is " + model);
        System.out.println("Color is " + color);
        System.out.println("Price is " + price);
        System.out.println("Storage is " + storage + "GB");
        System.out.println("Has camera? " + hasCamera);
        System.out.println("Brand is " + brand + "\nModel is " + model + "\nColor is " + color + "\nPrice is " + price + "\nStorage is " + storage + "256GB" + "\nHas Camera " + hasCamera);
    }
}
