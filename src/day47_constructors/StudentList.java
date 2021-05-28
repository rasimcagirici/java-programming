package day47_constructors;

public class StudentList {
    public static void main(String[] args) {
        Student student = new Student("Rasim Cagirici",28 ,"Male","Cybertek School");
        System.out.println(student);
        System.out.println();
        Student student1 = new Student();
        System.out.println(student1);
    }
}
