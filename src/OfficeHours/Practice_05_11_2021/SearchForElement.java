package OfficeHours.Practice_05_11_2021;

import java.util.*;

public class SearchForElement {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("one","two","three","two"));
        System.out.println(findIndex(list,"two"));
        System.out.println(findIndex(list,"two",2));
    }
    public static int findIndex(ArrayList<String> words, String element) {
        int index = -1;

        for (int i = 0; i < words.size(); i++) {
            if(words.get(i).equals(element)) {
                index = i;
                break;
            }
        }
        return index;
    }

    /**
     * Overloading findInxex method to have a starting point
     * @param words - list of elements given
     * @param element - the element that we are looking for
     * @param startingIndex - the index number where the search starts from
     * @return - the method returns the index where the element is found in the given arraylist
     *              and if the element does not exist the method will return -1
     */

    public static int findIndex(ArrayList<String> words, String element, int startingIndex) {
        int index = -1;

        for (int i = startingIndex; i < words.size(); i++) {
            if (words.get(i).equals(element)) {
                index = i;
                break;
            }
        }
        return index;
    }
}
