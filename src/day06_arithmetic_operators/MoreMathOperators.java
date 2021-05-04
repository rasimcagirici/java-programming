package day06_arithmetic_operators;

public class MoreMathOperators {
    public static void main(String[] args){
        int toyata = 431;
        int honda = 233;
        int vw = 2;
        int tesla = 20;
        int nissan = 1;
        int bmw = 155;
        int totalCarsInParking = toyata + honda + vw + tesla + nissan + bmw;

        System.out.println("There are " + totalCarsInParking + " total cars in parking lot");

        String pizza = "hawaiian";
        int slices = 8;
        int people = 4;
        int slicesPerPerson = slices / people;
        System.out.println("there are " + slicesPerPerson + " slices per person");
        System.out.println("we ordered " + pizza + " pizza with " + slices + " slices. \n" + people +
                " people ate " + slicesPerPerson + " slices each");
    }
}
