package day35_methods_with_param;

public class Counters {
    public static void main(String[] args) {
       count(5);
       count(7);
       count(2);
       String word = "Hello my friend";
       count(word.length());
       printAge(2021);
    }
    public static void count(int num) {
        for (int i = 0; i <= num; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void printAge(int year) {
        int age = 2021 - year;
        System.out.println("Brith year: " + year + " Age " + age);
    }
}
