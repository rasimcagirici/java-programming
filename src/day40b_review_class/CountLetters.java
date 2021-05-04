package day40b_review_class;

public class CountLetters {
    public static void main(String[] args) {
        countLetter("apple tree");

    }
    public static void countLetter(String str) {
        String checked = "";
        for (int i = 0; i < str.length(); i++) {
            char eachLetter = str.charAt(i);
            int count = 0;
            if (!checked.contains("" + eachLetter)) {
                for (int j = 0; j < str.length(); j++) {
                    if (eachLetter == str.charAt(j)) {
                        count++;
                    }
                }
                System.out.print("" + eachLetter + count);
                checked += eachLetter;
            }
        }
    }
}
