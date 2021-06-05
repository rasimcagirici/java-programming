package day50_inheritance;

public class AudioBook extends Book {
    int length;
    String narrator;
    public void listen() {
        System.out.println("I am listening to " + title + " by author " + author + " and its narrated by " + narrator);
    }
}
