package day61_exceptions_collections;

public class CustomExceptionTest {

    public static void main(String[] args) {

        int minutes = 30;

        System.out.println("Class is going on for " + minutes + " minutes");
        if (minutes > 50) {
            throw new BreakTimeException();
        }

        System.out.println("Lets continue the class");

    }

}
