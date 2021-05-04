package day24_loops;

import java.util.*;

public class CountUntil {
    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number to count until: ");
        int numberToStop = scan.nextInt();
        int count = 1;
        while (count <= numberToStop) {
            System.out.println("Count " + count + " of " + numberToStop);
            count++;
            Thread.sleep(1000);
        }
    }
}
