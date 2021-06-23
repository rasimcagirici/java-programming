package day56_abstraction.drivable;

import day56_abstraction.greeting.Greeting;

public class Plane extends Transportation implements SelfDrivable, Greeting {

    @Override
    public void autoPiloting() {
        System.out.println("Plane will be going on auto pilot");
    }

    @Override
    public void transportPeople() {
        System.out.println("Flying to people to desired destination");

    }

    @Override
    public void cost(int mile) {
        System.out.println("Plane cost " + (mile * 25.0) + " to fly " + mile + " miles");
    }

    @Override
    public void hi() {
        System.out.println("Welcome aboard");

    }

    @Override
    public void bye() {
        System.out.println("Thanks for flying with us");
    }

    public void land() {
        System.out.println("Plane has landing");
    }

}
