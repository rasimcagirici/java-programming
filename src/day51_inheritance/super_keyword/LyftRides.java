package day51_inheritance.super_keyword;

public class LyftRides {
    public static void main(String[] args) {
        Lyft lyftRide = new Lyft();
        LyftXL lyftXLRide = new LyftXL();
        Lux luxRide = new Lux();

        System.out.println("lyftRide = " + lyftRide.calculateRate(5));
        System.out.println("lyftXLRide = " + lyftXLRide.calculateRate(5));
        System.out.println("luxRide = " + luxRide.calculateRate(5));
    }
}
