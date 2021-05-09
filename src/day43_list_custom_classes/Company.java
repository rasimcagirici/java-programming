package day43_list_custom_classes;

public class Company {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.name = "Rasim Cagirici";
        employee1.jobTitle = "SDET";
        employee1.work();

        Employee employee2 = new Employee();
        employee2.name = "Bob Derskhin";
        employee2.jobTitle = "Scrum Master";
        employee2.work();

        Employee employee3 = new Employee();
        employee3.name = "Kumar Flipkin";
        employee3.jobTitle = "Developer";
        employee3.work();
    }
}
