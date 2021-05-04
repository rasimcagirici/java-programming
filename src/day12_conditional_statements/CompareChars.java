package day12_conditional_statements;

public class CompareChars {
    public static void main(String[] args) {
        char letter1 = 'A';
        char letter2 = 'B';

        boolean letterValues = letter1 == letter2;
        System.out.println(letterValues);

        letterValues = letter1 > letter2;
        System.out.println(letterValues);

        letterValues = letter2 > letter1;
        System.out.println(letterValues);
    }
}
