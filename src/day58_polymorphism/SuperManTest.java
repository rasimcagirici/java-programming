package day58_polymorphism;

public class SuperManTest {

    public static void main(String[] args) {

        Father spMan1 = new SuperMan();
        spMan1.playWithKid();
        spMan1.feedKid();
        spMan1.raiseKid();

        Worker spMan2 = new SuperMan();
        spMan2.work("SDET");
        spMan2.getPaid();

    }

}
