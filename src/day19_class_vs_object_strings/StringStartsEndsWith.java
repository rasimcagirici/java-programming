package day19_class_vs_object_strings;

public class StringStartsEndsWith {
    public static void main(String[] args) {
        String word = "Fenerbahce";
        System.out.println(word.startsWith("er"));

        String firstName = "Rasim";

        if (firstName.startsWith("Mr. ")) {
            System.out.println("Man");
        } else if (firstName.startsWith("Mrs. ")) {
            System.out.println("Married women");
        } else if (firstName.startsWith("Ms. ")) {
            System.out.println("Single Women");
        } else if (firstName.startsWith("Sr. ")) {
            System.out.println("Senior");
        } else if (firstName.startsWith("Dr. ")) {
            System.out.println("Doctor");
        } else {
            System.out.println("Declined to Identify");
        }

        String url = "www.website.edu";

        if (url.endsWith(".com")) {
            System.out.println("Commercial Website");
        } else if (url.endsWith(".ru")) {
            System.out.println("Russian website");
        } else if (url.endsWith(".gov")) {
            System.out.println("Government website");
        } else if (url.endsWith(".edu")) {
            System.out.println("Education website");
        } else if (url.endsWith(".org")) {
            System.out.println("Organization website");
        } else {
            System.out.println("Invalid domain");
        }
    }
}
