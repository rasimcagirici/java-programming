package loop_practice;

import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int max = 0;
        int min = 0;
        for (int i = 1; i <= 5; i++) {
            int num = scan.nextInt();
            if (num >= max) {
                max = num;
            }
            if (num <= min) {
                min = num;
            }
        }
        System.out.println("max = " + max);
        System.out.println("min = " + min);
    }
}
