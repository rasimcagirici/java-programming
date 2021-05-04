package day18_conditions_practice_strings_intro;

public class ScoreRangeTest {
    public static void main(String[] args) {
        int score = 80;

        if(score >= 1 && score <= 59) {
            System.out.println("F");
        }else if (score >=60 && score <= 69) {
            System.out.println("D");
        } else if (score >=70 && score <= 79) {
            System.out.println("C");
        } else if (score >=80 && score <= 89) {
            System.out.println("B");
        } else if (score >= 90 && score <=100) {
            System.out.println("A");
        } else {
            System.out.println("invalid score");
        }
    }
}
