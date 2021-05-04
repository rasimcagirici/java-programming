package day17_ternary_nested_conditions;

public class MoreTernary {
    public static void main(String[] args) {
        double hourlyRate = 50;
        String status = (hourlyRate>=50) ? "accept" : "reject";

        System.out.println("I will " + status + " if my hourly rate is " + hourlyRate);
        
        String todayClass = "Soft Skill";
        String teacher = (todayClass.equals("Java")) ? "Murodil/Saim" : "Nadir";

        System.out.println("teacher = " + teacher);
        
        boolean isEligibleToDrive = true;
        
        String driving = isEligibleToDrive ? "has DL, can drive" : "No DL, cannot drive";

        System.out.println("driving = " + driving);
    }
}
