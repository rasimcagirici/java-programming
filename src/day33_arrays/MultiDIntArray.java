package day33_arrays;

import java.util.*;

public class MultiDIntArray {
    public static void main(String[] args) {
        int[][] nums = { {5, 10, 15, 20},
                         {25, 30, 35, 40},
                         {45, 50, 55, 60},
                         {65, 70, 75, 80},
                         {85, 90, 95, 100} };
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.println(nums[i][j]);
            }
        }
    }
}
