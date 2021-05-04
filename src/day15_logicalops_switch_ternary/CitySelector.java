package day15_logicalops_switch_ternary;

public class CitySelector {
    public static void main(String[] args) {
        String city = "Chicago";


        if(city.equals("Moscow") || city.equals("Tampa")) {
            System.out.println("Willing to relocate to " + city);
        } else {
            System.out.println("Not considering " + city);
        }

        String teacher = "Saim";
        if(teacher.equals("Saim") || teacher.equals("Murodil")) {
            System.out.println("It is a java class with " + teacher);
        } else if(teacher.equals("Nadir")) {
            System.out.println("Soft skill class with " + teacher);
        } else {
            System.out.println("Some other class with " + teacher);
        }

        String company = "Google";
        double salary = 90_000;

        if(company.equals("Google") || salary >= 100_000) {
            System.out.println("Accept offer from " + company);
        } else {
            System.out.println("Reject offer from " + company);
        }
    }
}
