package day56_abstraction;

public class GreetingActions {
    public static void main(String[] args) {

        TurkishLanguage tL = new TurkishLanguage();
        tL.hi();
        tL.bye();

        Greeting greeting = new TurkishLanguage();
        greeting.hi();
        greeting.bye();

        JapaneseLanguage jL = new JapaneseLanguage();
        jL.hi();
        jL.bye();

        greeting = new JapaneseLanguage();
        greeting.hi();
        greeting.bye();

    }
}
