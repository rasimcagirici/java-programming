package day56_abstraction;

public class GreetingActions {
    public static void main(String[] args) {

        TurkishLanguage tL = new TurkishLanguage();
        tL.hi();
        tL.bye();
        Greeting greeting = new TurkishLanguage();
        greeting.hi();
        greeting.bye();

    }
}
