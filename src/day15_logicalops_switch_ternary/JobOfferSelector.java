package day15_logicalops_switch_ternary;

public class JobOfferSelector {
    public static void main(String[] args) {
        String location = "San Diego, CA";
        double salary = 150_000.0;
        boolean isRemote = true;
        boolean hasBenefits = true;

        if(isRemote && hasBenefits && salary >= 150_000 && location.equals("San Diego, CA")) {
            System.out.println("Accept job offer");
        } else {
            System.out.println("Decline job offer");
        }

    }
}
