package InterviewPractice;

import java.util.Arrays;

public class AlphanumericString {

    public static void main(String[] args) {
        String word = "DC501GCCCA098911";
        System.out.println(alphanumericSort(word));
                     //CD015ACCCG011899
    }

   public static String alphanumericSort(String word) {
        String str = "";
        String result = "";

        for (int i = 0; i < word.length(); i++) {
            str += word.charAt(i);
            if (Character.isAlphabetic(word.charAt(i)) && i < word.length()-1) {
                if (Character.isDigit(word.charAt(i+1))) {
                    str += ",";
                }
            }
            if (Character.isDigit(word.charAt(i)) && i < word.length()-1) {
                if (Character.isAlphabetic(word.charAt(i+1))) {
                    str += ",";
                }
            }
        }

        String[] arr = str.split(",");

        for (String each : arr) {
            char[] ch = each.toCharArray();
            Arrays.sort(ch);
            for (int i = 0; i < ch.length; i++) {
                result += ch[i];
            }

        }
        return result;
    }
}
