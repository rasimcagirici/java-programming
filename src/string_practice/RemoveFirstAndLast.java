package string_practice;

public class RemoveFirstAndLast {
    public static void main(String[] args) {
        String word1 = "oh happy day";
        String word2 = "my life is fully of java";
        System.out.println(word1.substring(1));
        System.out.println(word2.substring(0,word2.length()-1));
    }
}
