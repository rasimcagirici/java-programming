package day32_arrays_split;

import java.util.Arrays;

public class SplitMethod {
    public static void main(String[] args) {
        String words = "java:python:selenium:html";
        String[] wordsArray = words.split(":");
        System.out.println(Arrays.toString(wordsArray));
        System.out.println("length of array = " + wordsArray.length);
        for (String each : wordsArray) {
            System.out.print(each + " ");
        }
        System.out.println();
        String sentence = "I am very happy with my progress today";
        System.out.println(sentence.split(" ")[0]); // treat it has an array
        String[] sentenceArr = sentence.split(" ");
        System.out.println(Arrays.toString(sentenceArr));
        for (String each : sentenceArr) {
            System.out.print(each + " ");
        }
        System.out.println("Number of words in sentence = " + sentenceArr.length);
    }
}
