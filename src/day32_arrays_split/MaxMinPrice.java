package day32_arrays_split;

import java.util.*;

public class MaxMinPrice {
    public static void main(String[] args) {
        String[] items  = {"Shoes", "Jacket","Gloves", "Airpods", "iPad", "iphone 11 case" };
        double[] prices = {99.99, 150.0, 9.99, 250.0 , 439.50, 39.99};
        int[] itemIDs =   {12345 , 12346, 12347, 12348, 12349, 12350};
        double maxPrice = prices[0];
        int indexOfMaxPrice = 0;
        double minPrice = prices[0];
        int indexOfMinPrice = 0;
        System.out.println(Arrays.toString(items));
        System.out.println(Arrays.toString(prices));
        System.out.println(Arrays.toString(itemIDs));
        for (int i = 0; i < items.length; i++) {
            if (prices[i] > maxPrice) {
                maxPrice = prices[i];
                indexOfMaxPrice = i;
            }
        }
        System.out.println(items[indexOfMaxPrice] + " - $" + maxPrice + " - #" + itemIDs[indexOfMaxPrice]);
        for (int i = 0; i < items.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
                indexOfMinPrice = i;
            }
        }
        System.out.println(items[indexOfMinPrice] + " - $" + minPrice + " - #" + itemIDs[indexOfMinPrice]);
    }
}
