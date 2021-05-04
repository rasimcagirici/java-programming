package day35_methods_with_param;

import java.util.*;

public class MultipleParams {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        showSum(5.4,5.98);
        int[] numArr = {10, 15, 5, 50, 45, 20, 25, 40, 35, 30};
        arrTest(numArr);
        showSum(scan.nextDouble(),scan.nextDouble());
    }
    public static void showSum(double num1, double num2) {
        System.out.println("Sum = " + (num1 + num2));
    }
    public static void arrTest(int[] numArr) {
        Arrays.sort(numArr);
        System.out.println(Arrays.toString(numArr));
    }
}
