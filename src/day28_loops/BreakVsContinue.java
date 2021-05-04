package day28_loops;

public class BreakVsContinue {
    public static void main(String[] args) {
        for (int n = 1; n <= 5; n++) {
            System.out.println(n);
            if (n == 4 || n == 5) {
                System.out.println(n);
                break;
            }
        }
        for (int i = 0; i < 10 ; i++) {
            if (i > 8) {
                continue;
            }
            System.out.println(i);

        }
    }
}
