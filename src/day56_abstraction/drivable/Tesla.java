package day56_abstraction.drivable;

import day56_abstraction.greeting.Greeting;

public class Tesla extends Transportation implements SelfDrivable, Greeting {

    @Override
    public void transportPeople() {
        System.out.println("Tesla is transporting people on the roads");
    }

    @Override
    public void cost(int mile) {
        System.out.println("Tesla costs " + (mile * 0.10) + " to driver " + mile + " miles");

    }

    @Override
    public void autoPiloting() {
        System.out.println("Car on autopilot");
    }

    @Override
    public void hi() {
        System.out.println("Hello hello peep peep");
    }

    @Override
    public void bye() {
        System.out.println("Bye bye Charge me Charge me");

    }
}
