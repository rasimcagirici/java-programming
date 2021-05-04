package string_practice;

public class MoveFirstWord {
    public static void main(String[] args) {
        String sentence = "Rasim loves Nurseda so much";
        String firstWord = sentence.substring(0,sentence.indexOf(" "));
        sentence = sentence.substring(sentence.indexOf(" ")+1);
        sentence += " " + firstWord;
        System.out.println(sentence);
    }
}
