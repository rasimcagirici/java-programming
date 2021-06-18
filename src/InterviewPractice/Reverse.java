package InterviewPractice;

public class Reverse {
    public static void main(String[] args) {
        System.out.println(reverse("abcd"));
    }

    public static String reverse(String word) {
        String result = "";
        for (int i = word.length()-1; i >= 0; i--) {
            result += String.valueOf(word.charAt(i));
        }
        return result;
    }
}
