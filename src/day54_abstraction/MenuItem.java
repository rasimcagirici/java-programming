package day54_abstraction;

public abstract class MenuItem {
    public abstract void prepare();
    public abstract void serve();
}

class Pizza extends MenuItem {

    @Override
    public void prepare() {
        System.out.println("prepared with dough, cheese, and sauce");
    }

    @Override
    public void serve() {
        System.out.println("served with a coke");
    }
}

class Salad extends MenuItem {

    @Override
    public void prepare() {
        System.out.println("prepared with mixed greens, tomatoes, onions, and olives");
    }

    @Override
    public void serve() {
        System.out.println("Salad is service with your choice of dressing");
    }
}
