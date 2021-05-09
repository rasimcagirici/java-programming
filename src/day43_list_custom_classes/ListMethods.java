package day43_list_custom_classes;

import java.util.*;

public class ListMethods {
    public static void main(String[] args) {
        System.out.println(getDay());
        System.out.println("getDay().size() = " + getDay().size());
        System.out.println("getDay().get(0) = " + getDay().get(0));
        List<String> dayNames = getDay();
        System.out.println("dayNames = " + dayNames);
        dayNames.add("java day");
        dayNames.removeIf(day -> day.length() == 6);
        System.out.println("dayNames after removeIf = " + dayNames);
        dayNames.removeIf(day -> day.length() == 8);
        System.out.println("dayNames after second removeIf = " + dayNames);
        System.out.println(getRandomList(5));
        List<Integer> nums = getRandomList(100);
        System.out.println("nums.size() = " + nums.size());
        System.out.println("nums = " + nums);
        nums.removeIf(n -> n < 90);
        System.out.println("nums = " + nums);
    }
    public static List<String> getDay() {
        List<String> days = new ArrayList<>(Arrays.asList("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"));
        return days;
    }
    public static List<Integer> getRandomList(int size) {
        Random random = new Random();
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            nums.add(random.nextInt(101));
        }
        return nums;
    }
}
