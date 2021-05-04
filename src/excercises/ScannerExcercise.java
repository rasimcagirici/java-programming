package excercises;

import java.util.Scanner;

public class ScannerExcercise {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How are you my friend?");
        String friend = scan.next();
        System.out.println("How is your java classes going?");
        String java = scan.next();
        System.out.println("Who is your java teacher?");
        String teacher = scan.next();
        System.out.println(teacher + " is a good teacher");
    }
}
