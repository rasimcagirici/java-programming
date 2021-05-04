package day29_nestedloop_arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        int[] nums = new int[3]; //one way to do it. This way is good if we know the count of items we need but don't know the values
        nums[0] = 5; //one way to do it. This way is good if we know the count of items we need but don't know the values
        nums[1] = 10; //one way to do it. This way is good if we know the count of items we need but don't know the values
        nums[2] = 7; // one way to do it. This way is good if we know the count of items we need but don't know the values
        System.out.println("value at index 0 = " + nums[0]);
        System.out.println("value at index 1 = " + nums[1]);
        System.out.println("value at index 2 = " + nums[2]);
        System.out.println("The sum of all indexes = " + (nums[0]+nums[1]+nums[2]));

        int i = 0;
        System.out.println(nums[i]);
        System.out.println("number of elements = " + nums.length);
        int len = nums.length;
        System.out.println("len = " + len);
        nums[0] = 100;
        nums[1] = 300;
        nums[2] = nums[0] + nums[1];
        System.out.println("nums[0] = " + nums[0]);
        System.out.println("nums[1] = " + nums[1]);
        System.out.println("nums[2] = " + nums[2]);

        int[] nums1 = {155, 210, 220, 500, 510, 200, 20, 1, 2000}; // second way to do it and the best way. good to use if we have data to assign already.
        System.out.println(nums1.length);

        double[] prices = new double[]{10.3, 44.0, 23.99,}; //third way to do it but doesn't seem necessary
        
    }
}
