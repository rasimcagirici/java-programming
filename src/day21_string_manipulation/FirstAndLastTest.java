package day21_string_manipulation;

public class FirstAndLastTest {
    public static void main(String[] args) {
        String word = "mom";
        char first = word.charAt(0);
        char last = word.charAt(2);

        if (first == last) {
            System.out.println("It is the same");
        } else {
            System.out.println("It is not the same");
        }

        String anotherWord = "aziza";
        char firstLetter = anotherWord.charAt(0);
        char lastLetter = anotherWord.charAt(anotherWord.length()-1);
        System.out.println(lastLetter);

        if (firstLetter == lastLetter) {
            System.out.println("First and Last letter is a match");
        } else {
            System.out.println("First and last don't match");
        }
        String word1 = "Rasim";
        System.out.println((word1.indexOf("m")));
    }
}
