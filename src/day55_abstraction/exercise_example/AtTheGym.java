package day55_abstraction.exercise_example;

public class AtTheGym {
    public static void main(String[] args) {

        Running running = new Running();
        running.start();
        running.perform();
        System.out.println(running.getCaloriesCount(10) + " calories");
        System.out.println("----------");

        Swimming swimming = new Swimming();
        swimming.start();
        swimming.perform();
        System.out.println(swimming.getCaloriesCount(20) + " calories");
        System.out.println("----------");

        FreeWeight freeWeight = new FreeWeight();
        freeWeight.start();
        freeWeight.perform();
        System.out.println(freeWeight.getCaloriesCount(30) + " calories");
        freeWeight.endLift();

    }
}
