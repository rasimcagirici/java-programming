package day18_conditions_practice_strings_intro;

public class ThreeNumbers {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 444;
        int num3 = 1111;

        if (num1 >= num2 && num1 >= num3) {
            System.out.println("Largest value: " + num1);
        } else if (num2 >= num1 && num2 >= num3) {
            System.out.println("Largest value: " + num2);
        } else {
            System.out.println("Largest value: " + num3);
        }
    }
}