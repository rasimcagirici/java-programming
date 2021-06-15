package InterviewPractice;

public class FrequencyOfChars {
    public static void main(String[] args) {
        String nonDup = "";
        String result = "";
        int count = 0;
        String word = "AAABBCDDDDD";

        for (int i = 0; i < word.length(); i++) {
            if (!nonDup.contains(word.charAt(i) + "")) {
                nonDup += word.charAt(i);
            }
        }

        for (int i = 0; i < nonDup.length(); i++) {
            count = 0;
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(j) == nonDup.charAt(i)) {
                    count++;
                }
            }
            result += "" + nonDup.charAt(i) + count;
        }
        System.out.println(result);
    }
}
