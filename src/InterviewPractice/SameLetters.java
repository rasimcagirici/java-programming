package InterviewPractice;

import java.util.Arrays;

public class SameLetters {
    public static void main(String[] args) {
        System.out.println(same("abc","acb"));
    }

    public static boolean same(String a, String b) {
        char[] a1 = a.toCharArray();
        char[] b1 = b.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(b1);
        String result = "";
        String result1 = "";

        for (int i = 0; i < a1.length; i++) {
            result += a1[i];
            result1 += b1[i];
        }
        return result.equals(result1);
    }
}
