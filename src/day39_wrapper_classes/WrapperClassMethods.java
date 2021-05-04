package day39_wrapper_classes;

public class WrapperClassMethods {
    public static void main(String[] args) {
        System.out.println(Integer.max(10,5)); //return larger of number
        System.out.println(Integer.sum(50,35)); //return sum of numbers
        System.out.println(Integer.min(5,2)); //return smallest number
        System.out.println("MIN INT: " + Integer.MIN_VALUE); //return minimum number int can be
        System.out.println("MAX INT: " + Integer.MAX_VALUE); // return maximum number int can be

        System.out.println(Double.max(10.5,5.5));
        System.out.println(Double.sum(55.5,35.5));
        System.out.println(Double.min(5.5,2.5));
        System.out.println("MIN DOUBLE: " + Double.MIN_VALUE);
        System.out.println("Max Double: " + Double.MAX_VALUE);
        System.out.println(Double.compare(5,1));
        System.out.println(Double.compare(5,5));
        System.out.println(Double.compare(5,45));

        System.out.println(Character.isDigit('8'));
        System.out.println(Character.isAlphabetic('a'));
        System.out.println(Character.isLetter('r'));
        System.out.println(Character.toLowerCase('A'));
        System.out.println(Character.toUpperCase('b'));
        System.out.println(Character.isLetter('9'));
        char letter = 'A';
        if (Character.isUpperCase(letter)) {
            System.out.println("It is uppercase");
        }
        String word = "JaVa iS FuN";
        for (int i = 0; i < word.length(); i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                System.out.print(word.charAt(i));
            }
        }



    }
}
