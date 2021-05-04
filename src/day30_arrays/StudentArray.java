package day30_arrays;

public class StudentArray {
    public static void main(String[] args) {

        String[] student1 = {"011985", "Rasim", "Cagirici", "B22", "(917)755-3314"};
        String id1 = student1[0];
        String firstName1 = student1[1];
        String lastName1 = student1[2];
        String batchNum1= student1[3];
        String phoneNum1 = student1[4];
        System.out.println("Student1 id = " + id1);
        System.out.println("Student1 first name = " + firstName1);
        System.out.println("Student1 last name = " + lastName1);
        System.out.println("Student1 batch number = " + batchNum1);
        System.out.println("Student1 phone number = " + phoneNum1);

        System.out.println();

        String[] student2 = {"011985", "Nurseda", "Cagirici", "B22", "(201)695-4934"};
        String id2 = student2[0];
        String firstName2 = student2[1];
        String lastName2 = student2[2];
        String batchNum2 = student2[3];
        String phoneNum2 = student2[4];
        System.out.println("Student2 id = " + id2);
        System.out.println("Student2 first name = " + firstName2);
        System.out.println("Student2 last name = " + lastName2);
        System.out.println("Student2 batch number = " + batchNum2);
        System.out.println("Student2 phone number = " + phoneNum2);

        if (student1.length == 5 && student2.length == 5) {
            System.out.println("student arrays have 5 String data");
        } else {
            System.out.println("student arrays need to have 5 String data");
        }

        if (student1.length == student2.length) {
            System.out.println("PASS: data array length match");
        } else {
            System.out.println("FAIL: data array length mismatch");
        }
        System.out.println(firstName1.toUpperCase() + " " + lastName1.toUpperCase());
        System.out.println((firstName1 + " " + lastName1).toUpperCase());
        System.out.println(firstName2.toUpperCase() + " " + lastName2.toUpperCase());
        System.out.println((firstName2 + " " + lastName2).toUpperCase());
        System.out.println(student1[1].toUpperCase() + " " + student1[2].toUpperCase());
        System.out.println((student1[1] + " " + student1[2]).toUpperCase());
        System.out.println(student2[1].toUpperCase() + " " + student2[2].toUpperCase());
        System.out.println((student2[1] + " " + student2[2]).toUpperCase());
    }
}
