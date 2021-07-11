package InterviewPractice;

public class FrequencyOfChars3 {
    public static void main(String[] args) {
        String word = "AAABBCDDDDD";
        System.out.println(frequencyOfChars(word));
    }

    public static String frequencyOfChars(String word) {
        String nonDup = "";
        String result = "";
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            if (!nonDup.contains(""+word.charAt(i))) {
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


        return result;
    }
}
