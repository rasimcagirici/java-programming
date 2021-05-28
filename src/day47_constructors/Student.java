package day47_constructors;

public class Student {
    private String name;
    private int age;
    private String gender;
    private String school;

    public Student() {
        name = "Unknown";
        age = 0;
        gender = "Unknown";
        school = "Unknown";
    }

    public Student(String name, int age, String gender, String school) {
        setName(name);
        setAge(age);
        setGender(gender);
        setSchool(school);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student Information: \nName: " + name + "\nAge: " + age + "\nGender: " + gender + "\nSchool: " + school;
    }
}
