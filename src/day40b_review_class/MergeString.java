package day40b_review_class;

public class MergeString {
    public static void main(String[] args) {
        String one = "abcs";
        String two = "efghijk";
        int length = 0;
        String result = "";
        if (one.length() >= two.length()) {
            length = one.length();
        } else {
            length = two.length();
        }
        for (int i = 0; i < two.length(); i++) {
            if(one.length()>i){
                result+=one.charAt(i);
            }
            if(two.length()>i){
                result+=two.charAt(i);
            }
        }
        System.out.println(result);
        }
    }
