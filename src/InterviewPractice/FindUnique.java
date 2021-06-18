package InterviewPractice;

public class FindUnique {
    public static void main(String[] args) {
        System.out.println(findUnique("aadbbBccC"));
    }

    public static String findUnique(String word) {
        String result = "";
        String[] arr = word.split("");
        for (String each : arr) {
            if (!result.contains(each)) {
                result += each;
            }
        }
        return result;
    }
}
