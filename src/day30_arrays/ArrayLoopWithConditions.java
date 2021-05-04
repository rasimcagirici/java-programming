package day30_arrays;

public class ArrayLoopWithConditions {
    public static void main(String[] args) {
        double[] prices = {22.9, 12.4, 43.12, 65.0, 100.4, 543.23, 98.32, 533.43, 34.23, 124.9, 234.23};
        String[] countries = {"Brazil", "China", "Cuba", "Sweden", "France", "Vietnam", "Albania",
                              "Brazil", "Portugal", "China", "Philippines", "Philippines", "China", "Philippines",
                              "China", "Armenia", "Philippines", "China", "Colombia", "Philippines", "Honduras",
                              "Indonesia", "Brazil", "China", "United States", "Russia"};
        System.out.println("---- PRICES MORE THAN 100 ----");
        for (double eachPrice : prices) {
            if (eachPrice > 100) {
                System.out.print(eachPrice + " ");
            }
        }
        System.out.println("\n---- PRICES BETWEEN 10 AND 70 INCLUSIVE ----");
        for (double eachPrice : prices) {
            if (eachPrice >= 10 && eachPrice <= 70) {
                System.out.print(eachPrice + " ");
            }
        }
        System.out.println("\n---- COUNT OF PRICES THAT ARE MORE THAN 50 ----");
        int count = 0;
        for (double price : prices) {
            if (price > 50) {
                count++;
            }
        }
        System.out.println("count = " + count);
        System.out.println("---- COUNTRIES WITH NAME LENGTH MORE THAN OR EQUAL TO 7");
        for (String each : countries) {
            if (each.length() >= 7) {
                System.out.print(each + " ");
            }
        }
    }
}
