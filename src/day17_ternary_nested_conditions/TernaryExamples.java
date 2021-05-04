package day17_ternary_nested_conditions;

public class TernaryExamples {
    public static void main(String[] args) {
        int score = 90;
        String result = (score>60) ? "pass" : "fail";
        char grade = (score>60) ? 'A' : 'B';
        String evenOdd = (score % 2 == 0) ? "even" : "odd";

        System.out.println("With a score of " + score + " you have " + result + " with a grade of " + grade);
        System.out.println("Your score is a " + evenOdd + " number");


        String quality = "good";
        int x = (quality.equals("good")) ? 100 : 0;
        System.out.println("The value of x is " + x);




    }
}
