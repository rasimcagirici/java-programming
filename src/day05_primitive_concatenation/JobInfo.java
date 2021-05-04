package day05_primitive_concatenation;

public class JobInfo {
    public static void main(String[] args){
        String title = "Java SDET", company = "Palo Alto Networks", jobDescription = "experience in Java, Selenium, Cucumber, Tomato, JUnit";
        int salary = 123, yearsEXP = 3;
        boolean hasBenefits = true;

        System.out.println("My job title is " + title + " and the company I work for is " + company + ".\n" +
                "I have " + jobDescription + "," + " and my yearly salary is $" + salary + "K.\n" +
                "I have " + yearsEXP + " years experience and it is " + hasBenefits + " that my job has benefits.");


    }
}
