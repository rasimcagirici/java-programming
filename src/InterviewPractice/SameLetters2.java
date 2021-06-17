package InterviewPractice;

import java.util.Arrays;

public class SameLetters2 {
    public static void main(String[] args) {
        System.out.println(same("dabcd","cbadd"));
    }

    public static boolean same(String a, String b) {
        char[] c1 = a.toCharArray();
        char[] c2 = a.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        String a1 = "";
        String b1 = "";

        for (char each : c1) {
            a1 += "" + each;
        }

        for (char each : c2) {
            b1 += "" + each;
        }

        return a1.equals(b1);
    }
}
