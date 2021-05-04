package string_practice;


public class MiddleChar {
    public static void main(String[] args) {
        String word = "elephant";
        int index = word.length()/2;
        if (word.length() % 2 == 1) {
            System.out.println(word.charAt(index));
        } else {
            System.out.println(word.charAt(index-1)+""+word.charAt(index));
        }
        if (word.length() % 2 == 1) {
            System.out.println(word.substring(index,index+1));
        } else {
            System.out.println(word.substring(index-1,index+1));
        }
    }
}
