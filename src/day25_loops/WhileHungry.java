package day25_loops;

public class WhileHungry {
    public static void main(String[] args) {
        boolean isHungry = true;
        int bananas = 0;
        while (isHungry) {
            bananas++;
            if (bananas == 1) {
                System.out.println("Eat " + bananas + " banana");
            } else {
                System.out.println("Eat " + bananas + " bananas");
            }
            if (bananas >= 3) {
                isHungry = false;
            }
        }
        System.out.println("Had enough bananas, lets get back to studying");
    }
}
