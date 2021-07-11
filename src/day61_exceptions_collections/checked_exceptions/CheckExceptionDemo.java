package day61_exceptions_collections.checked_exceptions;

public class CheckExceptionDemo {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("About to sleep for 5 seconds");
        Thread.sleep(5000);
        System.out.println("Woke up after 5 seconds");
    }

}
