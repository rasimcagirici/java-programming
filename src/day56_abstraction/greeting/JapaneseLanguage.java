package day56_abstraction.greeting;

public class JapaneseLanguage implements Greeting{

    @Override
    public void hi() {
        System.out.println("こんにちは");
    }

    @Override
    public void bye() {
        System.out.println("さようなら");
    }
}
