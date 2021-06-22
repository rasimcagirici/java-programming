package day55_abstraction.interfaces_demo;

public interface MyInterface {
    public abstract void learn();
}

interface MyInterface2 {
    public abstract void learn2();
}

class MyClass implements MyInterface, MyInterface2 {

    @Override
    public void learn() {
        System.out.println("Learning in MyClass");
    }

    @Override
    public void learn2() {

    }
}

class Main {
    public static void main(String[] args) {

        MyClass myClass = new MyClass();

    }
}
