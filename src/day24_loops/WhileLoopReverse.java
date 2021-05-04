package day24_loops;

public class WhileLoopReverse {
    public static void main(String[] args) throws InterruptedException {

        int count = 5;
        while (count >=0) {
            System.out.println("count = " + count);
            count--;
            Thread.sleep(1000);
        }
        System.out.println("Finished the count");

        int unreadSMS = 10;
        System.out.println("I have total " + unreadSMS + " unread SMS messages.");
        while (unreadSMS > 0) {
            System.out.println("Read message # " + unreadSMS);
            unreadSMS--;
            Thread.sleep(1000);
        }
        System.out.println("Read all messages");
    }
}
