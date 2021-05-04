package day04_variables_intro;

public class AmazonItem {
    public static void main(String[] args){
        String description = "HIC wooden spoon";
        int ratingCount = 181;
        double price = 5.99;
        String seller = "Amazon.com";
        String prime = "✅";

        System.out.println("--- PRODUCT INFORMATION ---");
        System.out.println(description);
        System.out.print("* * * * * ");
        System.out.println(ratingCount);
        System.out.print("$");
        System.out.println(price);
        System.out.println(seller);
        System.out.print("Prime ");
        System.out.println(prime);
    }
}
