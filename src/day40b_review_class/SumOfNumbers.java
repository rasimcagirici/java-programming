package day40b_review_class;

public class SumOfNumbers {
    public static void main(String[] args) {
        System.out.println(getSumFromString("a5bc12def100"));

    }
    public static int getSumFromString(String str) {
        int sum = 0;
        String num = "";
        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))) {
                num += str.charAt(i);
                if(i == str.length()-1 || !Character.isDigit(str.charAt(i+1))) {
                    sum += Integer.parseInt(num);
                    num = "";
                }
            }
        }
        return sum;
    }
}
