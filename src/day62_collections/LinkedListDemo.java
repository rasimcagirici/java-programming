package day62_collections;

import java.util.*;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {

        LinkedList<String> friend = new LinkedList<>();

        List<Integer> scores = new LinkedList<>();
        scores.add(5);
        scores.add(42);
        scores.add(23);
        scores.add(42);
        System.out.println(scores);
        System.out.println("" + scores.get(0));

        friend.add("Mahliya");
        friend.add("Abbas");
        friend.add("Nevzat");
        System.out.println(friend.getFirst());

    }
}
