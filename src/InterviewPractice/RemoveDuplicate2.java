package InterviewPractice;

public class RemoveDuplicate2 {
    public static void main(String[] args) {
        String word = "AAABBBCCCDDD";
        System.out.println(removeDup(word));
    }

    public static String removeDup(String word) {
        String result = "";

        for (int i = 0; i < word.length(); i++) {
            if (!result.contains(""+word.charAt(i))) {
                result += word.charAt(i);
            }
        }
        return result;
    }
}
