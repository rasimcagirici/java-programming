package day37_methods_overloading;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        addNumbers(5,10,20,24,26,90,100,30,70,1,4);
        addNumbers(5,10,15,20,25,30,35,40,45,50,55,60,65,70,75,80,85,90,95,100);
        addNumbers(100,95,90,85,80,75,70,65,60,55,50,45,40,35,30,25,20,15,10,5);
        addNumbers();
    }
    public static void addNumbers (int... nums) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int sum = 0;
        for (int n : nums) {
            sum += n;
        }
        System.out.println("sum of nums is - " + sum);
    }
}
