package day45_oop;

public class ComparingStrings {
    public static void main(String[] args) {
        String word1 = "java";
        String word2 = "java";
        String word3 = new String("java");
        String word4 = new String("java");
        String word5 = word4;
        System.out.println(word1 == word2); //true
        System.out.println(word2 == word3); //false
        System.out.println(word3 == word4); //false
        System.out.println(word3 == word5); //false
        System.out.println(word4 == word5); //true

    }
}
