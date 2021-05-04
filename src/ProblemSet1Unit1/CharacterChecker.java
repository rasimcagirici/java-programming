package ProblemSet1Unit1;

public class CharacterChecker {
    public static void main(String[] args) {
        char letter = 'B';
        if (letter >= 65 && letter <= 90) {
            System.out.println("uppercase");
        } else if (letter>=97 && letter<=122) {
            System.out.println("lowercase");
        }
    }
}
