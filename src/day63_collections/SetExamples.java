package day63_collections;

import java.util.*;

public class SetExamples {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();

        set.add(100);
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(2);

        System.out.println(set);

        Set<String> words = new HashSet<>();
        words.add("hello");
        words.add("world");
        words.add("java");
        words.add("java");
        words.add("collection");

        System.out.println(words);

        List<String> wordsList = new ArrayList<>(words);
        System.out.println(wordsList.get(0));

        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("24");
        linkedHashSet.add("java");
        linkedHashSet.add("$#");
        linkedHashSet.add("53");
        linkedHashSet.add("apple");
        linkedHashSet.add("java");
        linkedHashSet.add("53");
        linkedHashSet.add("cucumber");
        System.out.println(linkedHashSet);

        Set<String> treeSet = new TreeSet<>();
        treeSet.add("24");
        treeSet.add("java");
        treeSet.add("$#");
        treeSet.add("53");
        treeSet.add("apple");
        treeSet.add("java");
        treeSet.add("53");
        treeSet.add("cucumber");
        System.out.println(treeSet);


    }

}
