package day24_loops;

import java.util.*;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        int secretNumber = random.nextInt(101);
        int guessingNumber;
        int counter = 0;
        do {
            System.out.println("Guess the secret number:");
            guessingNumber = scan.nextInt();
            if (guessingNumber > secretNumber) {
                System.out.println("Your number is too large");
                counter++;
            }
            if (guessingNumber < secretNumber ) {
                System.out.println("Your number is too small");
                counter++;
            }
            if (counter == 5) {
                System.out.println("Maximum guess exceeded");
                System.out.println("Secret number is " + secretNumber);
                return;
            }
        } while (guessingNumber != secretNumber);
        System.out.println("Congratulations, you won! secrent number: " + secretNumber);
    }
}
