package day24_loops;

public class Alphabet {
    public static void main(String[] args) throws InterruptedException {
        char letter = 'a';
        while (letter <= 'z') {
            System.out.print(letter + " ");
            letter++;
            Thread.sleep(500);
        }
        System.out.println();
        letter = 'z';
        while (letter >= 'a') {
            System.out.print(letter + " ");
            letter--;
            Thread.sleep(500);
        }
    }
}
