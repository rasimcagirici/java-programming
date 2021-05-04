package day25_loops;

public class PrintEvenOrOddNumbers {
    public static void main(String[] args) {
        System.out.print("EVEN NUMBERS 0-100:");
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(" " + i + " ");
            }
        }
        System.out.print("\nODD  NUMBERS 0-100:");
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.print(" " + i + " ");
            }
        }
    }
}
