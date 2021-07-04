package java_practices.method_usage;

public class FirstClass {

    int a = 5;

    public void getData() {
        System.out.println("I am in first method");
    }

    public static void main(String[] args) {

        FirstClass firstClass = new FirstClass();
        firstClass.getData();
        System.out.println(firstClass.a);

        SecondClass secondClass = new SecondClass();
        secondClass.setData();

    }
}
