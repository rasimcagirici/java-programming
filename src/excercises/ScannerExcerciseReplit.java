package excercises;

import java.util.Scanner;

public class ScannerExcerciseReplit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter subject name number 1 and score for this subject");
        String subject1 = scan.next();
        double num1 = scan.nextDouble();

        System.out.println("Please enter subject name number 2 and score for this subject");
        String subject2 = scan.next();
        double num2 = scan.nextDouble();

        System.out.println("Please enter subject name number 3 and score for this subject");
        String subject3 = scan.next();
        double num3 = scan.nextDouble();

        System.out.println("Please enter subject name number 4 and score for this subject");
        String subject4 = scan.next();
        double num4 = scan.nextDouble();

        System.out.println("Please enter subject name number 5 and score for this subject");
        String subject5 = scan.next();
        double num5 = scan.nextDouble();

        System.out.println("Summary: " + subject1 + " - " + num1 + ", " + subject2 + " - " + num2 + ", " + subject3 + " - " + num3 + ", " + subject4 + " - " + num4 + ", " + subject5 + " - " + num5);

        System.out.println("Your average score is: " + ((num1+num2+num3+num4+num5)/5));
        System.out.println("Thank you for using grader!");
        System.out.println("Goodbye!");
    }
}
