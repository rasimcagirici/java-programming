package day45_oop;

public class TrafficLightObjects {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();
        trafficLight.changeColor("Red");
        trafficLight.showColor();
        trafficLight.changeColor("Green");
        trafficLight.showColor();
        TrafficLight trafficLight1 = new TrafficLight();
        trafficLight1.changeColor("brown");
    }
}
