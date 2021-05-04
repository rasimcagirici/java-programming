package day22_string_manipulation;

public class IndexExample {
    public static void main(String[] args) {
        String technologies = "java, html, css, selenium, testing, maven, cucumber";
        System.out.println(technologies.indexOf(","));
        System.out.println(technologies.lastIndexOf("r"));

        String word = "hello";

        System.out.println(word.substring(2,4));
    }
}
