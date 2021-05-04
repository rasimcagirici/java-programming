package excercises;

import java.util.Scanner;

public class RemoveWord {
    public static String clean (String text , String badWord) {
        String removeWord = badWord + " ";
        text.replace(removeWord, "");
        return text;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(clean(in.nextLine(), in.nextLine()));
    }
}
