package day32_arrays_split;

import java.util.Arrays;

public class SentenceSplit {
    public static void main(String[] args) {
        String sentence = "Java is fun";
        String[] sentenceArr = sentence.split(" ");
        System.out.println(Arrays.toString(sentenceArr));
        String googleResult = "About 1,810,000 results (0.68 seconds)";
        String[] googleResultArr = googleResult.split(" ");
        System.out.println(Arrays.toString(googleResultArr));
        System.out.println(googleResultArr.length);
        System.out.println("Count = " + googleResultArr[1]);
        System.out.println("Seconds = " + googleResultArr[3].replace("(",""));
    }
}
