package day20_string_manipulation;

public class StringIsEmpty {
    public static void main(String[] args) {
        String jobTitle = "";
        System.out.println(jobTitle.isEmpty());

        if (jobTitle.isEmpty()) {
            System.out.println("Job title is empty");
        } else {
            System.out.println("Job title looks good");
        }

        if (jobTitle.length() == 0) {
            System.out.println("Job title is empty");
        } else {
            System.out.println("Jot title looks good");
        }

        String veggie = "carrots";

        if (!veggie.isEmpty()) {
            System.out.println("we have " + veggie);
        }
    }
}
