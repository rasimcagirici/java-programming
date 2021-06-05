package day50_inheritance;

public class Student extends Person {
    int studentID;
    String schoolName;

    public void study(String topic) {
        System.out.println(name + " is studying " + topic);
    }
}
