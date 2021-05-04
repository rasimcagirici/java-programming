package day33_arrays;

import java.util.*;

public class SplitReview {
    public static void main(String[] args) {
        String word = "java";
        String[] wordArr = word.split("a");
        System.out.println(Arrays.toString(wordArr));
        int countOfA = wordArr.length-1;
        if (word.endsWith("a")) {
            countOfA++;
        }
        System.out.println("countOfA = " + countOfA);
        System.out.println("------Split with Empty String-----");
        String[] wordArr1 = word.split("");
        System.out.println(Arrays.toString(wordArr1));

        System.out.println("-----Split Using RegEx-----");
        String word1 = "1java1sql2html";
        String[] word1Arr = word1.split("\\d");
        System.out.println(Arrays.toString(word1Arr));
    }
}
