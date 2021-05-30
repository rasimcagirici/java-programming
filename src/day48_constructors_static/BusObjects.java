package day48_constructors_static;

public class BusObjects {
    public static void main(String[] args) {

        Bus bus = new Bus();
        bus.driver = new Driver("Abbas");
        bus.engine = new Engine(10);
        System.out.println(bus);

        Bus metroBus = new Bus();
        metroBus.driver = new Driver("Aziz");
        metroBus.engine = new Engine(15);
        System.out.println(metroBus);

        System.out.println(bus.driver.getName());
        System.out.println(metroBus.driver.getName());
    }
}
