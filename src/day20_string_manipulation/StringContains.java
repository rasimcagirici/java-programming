package day20_string_manipulation;

public class StringContains {
    public static void main(String[] args) {
        String company = ("Capital one");
        System.out.println(company.contains("i"));
        System.out.println(company.contains("ital"));
        System.out.println(company.contains("l o"));

        if (company.contains(" ")) {
            System.out.println("Multiple words company name");
        } else {
            System.out.println("Single word company name");
        }

        String etsyTitle = "Wooden spoon | Etsy";
        if (etsyTitle.contains(" | ")) {
            System.out.println("Pass - title check passed");
        } else {
            System.out.println("Fail - title check failed");
        }

        String firstName = "RAsim";

        if (firstName.contains("R") && firstName.toLowerCase().contains("a")) {
            System.out.println("Name is " + firstName);
        } else {
            System.out.println("Invalid name");
        }

        String email = "rasim@gmail.com";

        if (email.contains("@") && email.endsWith(".com")) {
            System.out.println("Valid email");
        } else {
            System.out.println("Invalid email");
        }

        String word = "Funuvbahce";

        if (word.contains("Funuv")) {
            word = word.replace("u", "e");
            word = word.replace("v", "r");
            System.out.println(word);
        } else {
            System.out.println(word);
        }
        String sentence = "java strings are fun";
        System.out.println(sentence.replace("java",""));
    }
}
