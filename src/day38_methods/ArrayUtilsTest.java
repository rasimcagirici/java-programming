package day38_methods;

public class ArrayUtilsTest {
    public static void main(String[] args) {
        int[] nums = {5, 23, 1, 543, 90};
        ArrayUtils.printArray(nums);
        ArrayUtils.printArray(new int[]{5,10,15,20,25,30,35,40,45,50});
        System.out.println("Sum = " + ArrayUtils.sum(new int[]{10,20,30,40,50}));
        System.out.println("Sum = " + ArrayUtils.sum(nums));
        int num = 60;
        System.out.println(ArrayUtils.contains(nums,num));
    }
}
