package day21_string_manipulation;

public class StringIndexOf {
    public static void main(String[] args) {
        String word = "Hello Motto, you are my beautiful friend motto. Thank you!";
        System.out.println(word.indexOf("!"));
        System.out.println(word.length()-1);
        System.out.println(word.indexOf("beautiful"));
        int count = word.indexOf("friend");
        System.out.println(count);
        count = count + word.indexOf("Thank");
        System.out.println(count);
    }
}
