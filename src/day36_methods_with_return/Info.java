package day36_methods_with_return;

import java.util.*;

public class Info {
    public static void main(String[] args) {
        System.out.println("Full name: " + fullname());
        System.out.println("Is the person married: " + isMarried());
        System.out.println("Age " + getAge());
        System.out.println("Birth year = " + getRandomYear());

        String name = fullname();
        boolean married = isMarried();
        int age = getAge();
        int year = getRandomYear();

        System.out.println("name = " + name);
        System.out.println("married = " + married);
        System.out.println("age = " + age);
        System.out.println("year = " + year);
    }
    public static String fullname() {
        return "Mike Smith";
    }
    public static boolean isMarried() {
        return false;
    }
    public static int getAge() {
        return 35;
    }
    public static int getRandomYear() {
        Random random = new Random();
        int randomYear = random.nextInt(2021);
        return randomYear;
    }
}
