package day42_arraylist;

import java.util.*;

public class UniqueFromList {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(2, 4, 4, 1, 5, 6, 0, 6));
        List<Integer> unique = getUniqueIntegers(nums);
        System.out.println(unique);
    }

    private static List<Integer> getUniqueIntegers(List<Integer> nums) {
        List<Integer> unique = new ArrayList<>();
        for (int num : nums) {
            if(Collections.frequency(nums, num) == 1) {
                unique.add(num);
            }
        }
        return unique;
    }
}
