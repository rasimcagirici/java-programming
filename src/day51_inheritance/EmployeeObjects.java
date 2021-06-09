package day51_inheritance;

public class EmployeeObjects {
    public static void main(String[] args) {

        Employee developer = new Employee();
        developer.jobTitle = "Java Developer";
        System.out.println(developer.calculateSalary(55.0));
        double annualDevSalary = developer.calculateSalary(60.0);
        System.out.println("annualDevSalary = " + annualDevSalary);


        Contractor tester = new Contractor();
        tester.jobTitle = "SDET";
        System.out.println(tester.calculateSalary(60.0));

        System.out.println(developer);
        System.out.println(tester);

    }
}
