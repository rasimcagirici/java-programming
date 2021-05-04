package day10_shorthand_operators;

public class ShortHandOperators {
    public static void main(String[] args) {
        int num1 = 10;
        num1 += 5;
        System.out.println("num1 = " + num1);
        num1 -= 5;
        System.out.println("num1 = " + num1);
        num1 *= 2;
        System.out.println("num1 = " + num1);
        num1 /= 2;
        System.out.println("num1 = " + num1);
        num1 %= 3;
        System.out.println("num1 = " + num1);
        
        String word = "Java";
        word += " programming";
        System.out.println("word = " + word);
        word += " is fun";
        System.out.println("word = " + word);
        word += " but \"selenium\" is more fun";
        System.out.println("word = " + word);
        
        word += 12345;
        System.out.println("word = " + word);
        
        char letter = 'A';
        System.out.println("letter = " + letter);

        letter +=3;
        System.out.println("letter = " + letter);

        letter += 'U';
        System.out.println("letter = " + letter);
    }
}
