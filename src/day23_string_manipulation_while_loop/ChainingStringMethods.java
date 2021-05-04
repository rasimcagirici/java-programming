package day23_string_manipulation_while_loop;


import java.util.Locale;

public class ChainingStringMethods {
    public static void main(String[] args) {
        String word = " wooden spoon ";
        System.out.println(word.toUpperCase().toLowerCase().trim().toUpperCase().toLowerCase().replace('w','f').replace(""," "));
        System.out.println(word.trim().replace(" ","").toUpperCase());

        String firstLetterCapital = "iSTANBUL";
        System.out.println(firstLetterCapital.toUpperCase().substring(0) + firstLetterCapital.substring(1,firstLetterCapital.length()).toLowerCase());
    }
}
