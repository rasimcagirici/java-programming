package day39_wrapper_classes;

public class ParseString {
    public static void main(String[] args) {
        String total = "45689";
        int count = Integer.parseInt(total) + 300;
        System.out.println(count);

        String strPrice = "123.5";
        if (Double.parseDouble(strPrice) > 100) {
            System.out.println("Price is more the 100");
        } else {
            System.out.println("Price is less than 100");
        }
        String sentence = "I wrote 1000 lines of code";
        String[] sentenceArr = sentence.split(" ");
        int linesOfCode = Integer.parseInt(sentenceArr[2]);
        System.out.println(linesOfCode);
    }
}
