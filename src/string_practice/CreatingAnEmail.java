package string_practice;

import java.util.*;

public class CreatingAnEmail {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        String email = "";
        if (word1.length() >= 6 && word2.length() >= 6) {
            email = word1.substring(0,4).toLowerCase();
            email += word2.substring(word2.length()-3).toLowerCase();
            email += "@CYBERTEK.COM".toLowerCase();
            System.out.println(email);
        } else {
            System.out.println("Invalid data");
        }
    }
}
