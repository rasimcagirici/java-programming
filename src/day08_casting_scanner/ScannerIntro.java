package day08_casting_scanner;

import java.util.Scanner; //Step 1: Import Data

public class ScannerIntro {
    public static void main(String[] args) {
        //Step 2: Create Scanner Object Using New Keyword Ex: Scanner variable = new object
        Scanner scan = new Scanner(System.in);
        //Step 3: Ask a question
        System.out.println("Please enter your name:");
        //Step 4: Take into and store into variable
        String firstName = scan.next();
        String lastName = scan.next();
        //Step 5: print variable with message
        System.out.println("nice to meet you, " + firstName + " " + lastName);

    }
}
