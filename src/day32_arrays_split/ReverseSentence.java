package day32_arrays_split;

import java.util.Arrays;

public class ReverseSentence {
    public static void main(String[] args) {
        String word1 = "java is fun";
        String word2 = "wooden spoon search";
        String[] word1Arr = word1.split(" ");
        String[] word2Arr = word2.split(" ");
        System.out.println(Arrays.toString(word1Arr));
        for (int i = word1Arr.length-1; i >= 0; i--) {
            System.out.print(word1Arr[i] + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(word2Arr));
        for (int i = word2Arr.length-1; i >= 0; i--) {
            System.out.print(word2Arr[i] + " ");
        }
    }
}
