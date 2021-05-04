package loop_practice;

public class EvenOddNumbers {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <=100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("Sum of even numbers: " + sum);
        sum = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 1) {
                sum += i;
            }
        }
        System.out.println("Sum of odd numbers: " + sum);
    }
}
