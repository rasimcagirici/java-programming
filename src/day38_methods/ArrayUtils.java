package day38_methods;

import java.util.Arrays;

public class ArrayUtils {
    public static void printArray(int[] nums) {
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    public static int sum(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }
    public static boolean contains(int[] nums, int num) {
        boolean found = false;
        for (int each : nums) {
            if (num == each) {
                found = true;
                break;
            }
        }
        return found;
    }
}