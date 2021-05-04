package excercises;

public class Email {
    public static void main(String[] args) {
        String word = "extreme";
        if (word.substring(0,1).equalsIgnoreCase("X")||word.substring(word.length()-1).equalsIgnoreCase("x")) {
            System.out.println(word.substring(1,word.length()-1));
        } else {
            System.out.println(word);
        }
    }
}
