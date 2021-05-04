package day31_array;

import java.util.*;

public class ArraysUtil {
    public static void main(String[] args) {
        int[] nums = {5, 3, 30, 0, 2, -90, -50, 60, 78, 1000};
        System.out.println(Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println("Min value: " + nums[0]);
        System.out.println("Max value: " + nums[nums.length-1]);
        String[] words = {"Zebra", "Zello", "Mellow", "Yellow", "Bellow", "Drago", "Malfoy", "Harry", "Smarry"};
        Arrays.sort(words);
        System.out.print(Arrays.toString(words));
        Arrays.sort(words, Collections.reverseOrder());
        System.out.print("\n" + Arrays.toString(words));
    }
}
