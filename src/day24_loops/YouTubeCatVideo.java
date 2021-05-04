package day24_loops;

public class YouTubeCatVideo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Starting: World's smallest cat - BBC");
        int seconds = 0;
        while (seconds <= 117) {
            if (seconds == 1) {
                System.out.println("Watch YouTube video: second: " + seconds);
                seconds++;
            } else {
                System.out.println("Watch YouTuve video: seconds: " + seconds);
                seconds++;
                Thread.sleep(1000);
            }
        }
        System.out.println("Finished watching cat video");

    }
}
