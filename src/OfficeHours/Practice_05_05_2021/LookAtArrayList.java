package OfficeHours.Practice_05_05_2021;

import java.util.*;

public class LookAtArrayList {
    public static void main(String[] args) {
        System.out.println(method2(Arrays.asList("happy","say","happy","do")));
        ArrayList<String> list = new ArrayList<>(Arrays.asList("one","two","three"));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list);
            if (list.get(i).length() == 3) {
                list.remove(list.get(i));
                i--;
            }
        }
        System.out.println(list);
    }
    public static ArrayList<Integer> method() {
        return new ArrayList<>();
    }
    public static int method2(List<String> words) {
        return 0;
    }
}
