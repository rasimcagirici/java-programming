package day42_arraylist;

import java.util.*;

public class MethodsWithList {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("java", "html", "selenium", "c#", "input", "title"));
        printStrList(words);
        printStrList(Arrays.asList("select", "option", "br", "python", "sql", "api"));
        int sum = sumIntegerList(Arrays.asList(10,40,50,100,200));
        System.out.println("sum = " + sum);
    }
    public static void printStrList(List<String> stringList) {
        for (String each : stringList) {
            System.out.print(each + " ");
        }
        System.out.println();
    }
    public static int sumIntegerList(List<Integer> sumOfInt) {
        int sum = 0;
        for (int each : sumOfInt) {
            sum += each;
        }
        return sum;
    }
}
