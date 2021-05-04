package day32_arrays_split;

import java.sql.SQLOutput;

public class MallShopping {
    public static void main(String[] args) {
        String[] items  = {"Shoes", "Jacket","Gloves", "Airpods", "iPad", "iphone 11 case" };
        double[] prices = {99.99, 150.0, 9.99, 250.0 , 439.50, 39.99};
        int[] itemIDs =   {12345 , 12346, 12347, 12348, 12349, 12350};
        System.out.println("------FIND THE INDEX OF 'Gloves' IN ITEMS ARRAY------");
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals("Gloves")) {
                System.out.println("Gloves found at index " + i);
                break;
            }
        }
        System.out.println("------SET BOOLEAN TO TRUE IF FIRST 'iPad' IS FOUND------");
        boolean iPadExists = false;
        for (int i = 0; i < items.length; i++) {
            if (items[i].equalsIgnoreCase("ipad")) {
                iPadExists = true;
                break;
            }
        }
        System.out.println("Does iPad exists - " + iPadExists);
        System.out.println("------PRINT A REPORT OF EACH SHOPPING ITEM------");
        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i] + " - $" + prices[i] + " Item ID " + itemIDs[i]);
        }
        for (int i = 0; i < items.length; i++) {
            if (items[i].equalsIgnoreCase("Jacket")) {
                System.out.println(items[i] + " - $" + prices[i] + " - #" + itemIDs[i]);
                break;
            }
        }
    }
}
