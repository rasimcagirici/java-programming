package InterviewPractice;

public class FrequencyOfChars2 {
    public static void main(String[] args) {
        String word = "AAABBCDDDDD";
        System.out.println(frequencyOfChar(word));
    }

    public static String frequencyOfChar(String word) {
        String result = "";
        String nonDup = "";

        for (int i = 0; i < word.length(); i++) {
            if (!nonDup.contains("" + word.charAt(i))) {
                nonDup += "" + word.charAt(i);
            }
        }

        for (int i = 0; i < nonDup.length(); i++) {
            int count = 0;
            for (int j = 0; j < word.length(); j++) {
                if (nonDup.charAt(i) == word.charAt(j)) {
                    count++;
                }
            }
            result += "" + nonDup.charAt(i) + count;
        }
        return result;
    }
}
