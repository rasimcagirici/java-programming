package day56_abstraction.drivable;


public class TransportationTest {
    public static void main(String[] args) {

        Tesla tesla = new Tesla();
        tesla.start();
        tesla.hi();
        tesla.transportPeople();
        tesla.autoPiloting();
        tesla.cost(50);
        tesla.stop();
        tesla.bye();

        Plane plane = new Plane();
        plane.start();
        plane.hi();
        plane.transportPeople();
        plane.autoPiloting();
        plane.cost(10000);
        plane.land();
        plane.bye();

        SelfDrivable sd = new Plane();
        SelfDrivable sd2 = new Tesla();

        Transportation tp = new Plane();
        Transportation tp2 = new Tesla();




    }
}
