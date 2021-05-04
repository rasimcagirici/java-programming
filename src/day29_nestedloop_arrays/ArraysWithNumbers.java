package day29_nestedloop_arrays;

public class ArraysWithNumbers {
    public static void main(String[] args) {
        int[] nums = new int[2]; // default values are always 0 until you assign a number
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        int[] counters = {10, 5, 20, 30, 6};
        System.out.println("length = " + counters.length);
        double[] prices = {2.0, 4.0, 6.0};
        System.out.println("length = " + prices.length);
        String[] cities = {"New York City", "Lodi", "Los Angeles", "San Diego"};
        System.out.println("length = " + cities.length);
    }
}
