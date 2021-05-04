package loop_practice;
/*
Write a program that can print all the ODD numbers between 0 ~ 100
that can be divisible by 3 & 5
• Write a program that can print all the EVEN numbers between 0 ~
100 that can be divisible by 3 & 5
 */
public class DivisibleByThreeAndFive {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 1) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.print(i + " ");
                }
            }
        }
        System.out.println();
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
