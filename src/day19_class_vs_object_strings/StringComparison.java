package day19_class_vs_object_strings;

public class StringComparison {
    public static void main(String[] args) {
        String city = "New York";
        System.out.println(city.equals("New York"));
        System.out.println(city.equalsIgnoreCase("new york"));
        System.out.println(city.equalsIgnoreCase("new York"));
    }
}
