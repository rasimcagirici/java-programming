package day42_arraylist;

import java.util.*;

public class CollectionsUtil {
    public static void main(String[] args) {
        List<Character> letters = new ArrayList<>();
        letters.addAll(Arrays.asList('j','a','v', 'a', 'i', 's','f','u','n'));
        System.out.println("size = " + letters.size());
        System.out.println(letters);
        Collections.reverse(letters);
        System.out.println(letters);
        int aCount = Collections.frequency(letters, 'a');
        System.out.println("aCount = " + aCount);
        System.out.println("Max char = " + Collections.max(letters));
        System.out.println("Min char = " + Collections.min(letters));
        System.out.println(Collections.replaceAll(letters, 'a', 'u'));
        System.out.println(letters);
        Collections.sort(letters);
        System.out.println("After sort = " + letters);

        List<Integer> nums = Arrays.asList(23,1,43,5,234,7,-9,0,5,5,5,5,5);
        System.out.println("nums = " + nums);
        Collections.reverse(nums);
        System.out.println("nums after reverse = " + nums);
        Collections.sort(nums);
        System.out.println("nums after sort = " + nums);
        int max = Collections.max(nums);
        int min = Collections.min(nums);
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        int count5 = Collections.frequency(nums,5);
        System.out.println("count5 = " + count5);
        Collections.reverse(nums);

        
    }
}
