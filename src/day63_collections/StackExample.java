package day63_collections;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {

        Stack<String> books = new Stack<>();
        books.add("Harry Potter");
        books.add("Leaders eat last");
        books.add("Java intro");
        books.push("Cucumber");
        System.out.println(books);
        //System.out.println(books.remove(0));
        //System.out.println(books.pop());
        System.out.println(books.peek());
        System.out.println("Final Version " + books);
    }
}
