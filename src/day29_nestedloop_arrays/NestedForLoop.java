package day29_nestedloop_arrays;

public class NestedForLoop {
    public static void main(String[] args) throws InterruptedException {
        for (int hour = 0; hour <= 1; hour++) {
            for (int minutes = 0; minutes <= 5; minutes++) {
                for (int seconds = 0; seconds <= 59; seconds++) {
                System.out.println(minutes + ":" + seconds);
                Thread.sleep(1000);
                }
            }
        }
    }
}
