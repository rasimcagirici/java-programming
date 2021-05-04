package day41_arraylist;

import java.util.*;

public class ArraysAsList {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(5,10,20,25,30,35,40,45,50,55,60);
        System.out.println(nums.size());
        System.out.println(nums);
        //nums.add(100); you can not add, remove, or clear when using asList
        List<Integer> nums1 = new ArrayList<>(Arrays.asList(5,10,20,25,30,40,35,45,50,55,60));
        nums1.add(100);
        System.out.println(nums1);
        Collections.sort(nums1);
        System.out.println(nums1);
        List<String> drinksWithCaffeine = new ArrayList<>(Arrays.asList("coffee", "tea", "monster", "red bull", "coke",
                                                                        "pepsi", "mdew", "kambucha"));
        drinksWithCaffeine.add("celsius");
        int caffeineAmount = 0;
        System.out.println("-----USING IF STATEMENT FOR CAFFEINE VALUES-----");
        for (String drink : drinksWithCaffeine) {
            if (drink.equals("monster") || drink.equals("red bull") || drink.equals("celsius")) {
                caffeineAmount = 150;
                System.out.println(drink + " --> " + caffeineAmount);
            } else if (drink.equals("coffee") || drink.equals("kambucha")) {
                caffeineAmount = 112;
                System.out.println(drink + " --> " + caffeineAmount);
            } else {
                caffeineAmount = 35;
                System.out.println(drink + " --> " + caffeineAmount);
            }
        }
        System.out.println("-----USING SWITCH STATEMENT FOR CAFFEINE VALUES-----");
        for (String drink : drinksWithCaffeine) {
            switch (drink) {
                case "monster": case "red bull": case "celsius":
                    caffeineAmount = 150;
                    System.out.println(drink + " --> " + caffeineAmount);
                    break;
                case "coffee": case "kambucha":
                    caffeineAmount = 112;
                    System.out.println(drink + " --> " + caffeineAmount);
                    break;
                default:
                    caffeineAmount = 35;
                    System.out.println(drink + " --> " + caffeineAmount);
            }
        }
        drinksWithCaffeine.forEach(drink -> System.out.println(drink));
        drinksWithCaffeine.forEach(drink -> {
            System.out.println("this is forEach block");
            System.out.println("drink = " + drink);
        });
    }
}
