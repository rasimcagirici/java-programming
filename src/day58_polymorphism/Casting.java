package day58_polymorphism;

public class Casting {

    public static void main(String[] args) {
        Worker superMan = new SuperMan();
        superMan.work("SDET");
        superMan.getPaid();

        ((Father)superMan).raiseKid();
        ((Father)superMan).feedKid();
    }
}
