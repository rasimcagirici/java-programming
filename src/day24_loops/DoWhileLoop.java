package day24_loops;

public class DoWhileLoop {
    public static void main(String[] args) throws InterruptedException {
        int counter = 0;
        do {
            System.out.println("Counter = " + counter);
            counter+=10;
            Thread.sleep(1000);
        } while (counter <= 100);

    }
}
