package ProblemSet1Unit1;

import java.util.Scanner;

public class ScannerAndIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("how many people do you live with?");
        int household = scan.nextInt();
        if (household < 2){
            System.out.println("Live with less than 2 people");
        } else if (household >=3 && household <=6) {
            System.out.println("Live with more than 6 people");
        } else {
            System.out.println("Live with more than 5 people");
        }
        System.out.println("What city do you live in?");
        scan.nextLine();
        String city = scan.nextLine();
        System.out.println("Do you live downtown?");
        boolean downtown = scan.nextBoolean();
        if (downtown) {
            System.out.println("Have you thought about moving to the suburbs?");
            boolean suburbs = scan.nextBoolean();
            if (suburbs) {
                System.out.println("Do it its great");
            } else {
                System.out.println("You should think about it");
            }
        }

            System.out.println("What’s your favorite animal?");
            scan.nextLine();
            String animal = scan.nextLine();
            System.out.println("Wow "  + animal + " is a great animal");
            System.out.println("How many pets do you want?");
            int pets = scan.nextInt();

            System.out.println("Interesting, do you want " + pets + " " + animal + "?");
        }
    }



