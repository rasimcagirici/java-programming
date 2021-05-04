package day19_class_vs_object_strings;


public class StringLength {
    public static void main(String[] args) {
        String word = "Fenerbahce";
        System.out.println(word);
        System.out.println("count: " + word.length());
        String firstName = "Rasim";
        System.out.println(firstName + " - " + firstName.length());
        int count = firstName.length();
        System.out.println("count = " + count);
        int count1 = "Rasim".length();
        System.out.println("count1 = " + count1);

        if (word.length() >= 6) {
            System.out.println("Password accepted");
        } else {
            System.out.println("Minimum number of characters not met");
        }
    }
}
