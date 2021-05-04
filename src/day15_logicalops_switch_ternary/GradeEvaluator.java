package day15_logicalops_switch_ternary;

public class GradeEvaluator {
    public static void main(String[] args) {
        char grade = 'F';

        if(grade == 'A' || grade == 'B' || grade == 'C') {
            System.out.println("Pass with " + grade);
        } else if(grade == 'D') {
            System.out.println("Qualify for retake with " + grade);
        } else if(grade == 'E') {
            System.out.println("Failed with " + grade);
        } else {
            System.out.println("Invalid Grade");
        }
    }
}
