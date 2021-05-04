package loop_practice;

import java.util.*;

public class DynamicAlphabet {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Upper or Lower?");
        String letter = scan.next();
        System.out.println("Ascending or descending order?");
        String order = scan.next();
        if (order.equalsIgnoreCase("ascending")) {
            if (letter.equalsIgnoreCase("upper")) {
                for (char letters = 'A'; letters <= 'Z'; letters++) {
                    System.out.print(letters + " ");
                }
            } else if (letter.equalsIgnoreCase("lower")) {
                for (char letters = 'a'; letters <= 'z'; letters++) {
                    System.out.print(letters + " ");
                }
            }
        }
        if (order.equalsIgnoreCase("descending")) {
            if (letter.equalsIgnoreCase("upper")) {
                for (char letters = 'Z'; letters >= 'A'; letters--) {
                    System.out.print(letters + " ");
                }
        } else {
            for (char letters = 'z'; letters >= 'a'; letters--) {
                System.out.print(letters + " ");
            }
        }
    }
    }
}
