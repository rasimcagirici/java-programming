package day41_arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingList {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(500); nums.add(50); nums.add(150);
        System.out.println("before sort: " + nums);
        Collections.sort(nums);
        System.out.println("after sort: " + nums);
    }
}
