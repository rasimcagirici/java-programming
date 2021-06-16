package day54_abstraction;

public abstract class Student {
    public void code(String language) {
        System.out.println("Student is coding using " + language);
    }

    public abstract void attendClass();
}

class OnlineStudent extends Student {

    @Override
    public void attendClass() {
        System.out.println("Online student is attending the class using Zoom");
    }
}

class CampusStudent extends Student {

    @Override
    public void attendClass() {
        System.out.println("Campus student is attending the class in person");
    }
}

class School {
    public static void main(String[] args) {

        OnlineStudent onlineStudent = new OnlineStudent();
        onlineStudent.code("Java");
        onlineStudent.attendClass();

        CampusStudent campusStudent = new CampusStudent();
        campusStudent.code("Javascript");
        campusStudent.attendClass();

    }
}
