package day61_exceptions_collections;

public class ElementaryStudentTest {

    public static void main(String[] args) {

        try {

            ElementaryStudent elementaryStudent1 = new ElementaryStudent();
            elementaryStudent1.setName("Bob");
            elementaryStudent1.setAge(1);
            System.out.println(elementaryStudent1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Code completed");

    }

}
