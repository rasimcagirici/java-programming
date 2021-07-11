package day61_exceptions_collections;

public class ElementaryStudent {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Name cannot be empty");
        } else {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 12 && age < 5) {
            throw new IllegalArgumentException("Age cannot be less than 5 and more than 12");
        } else {
            this.age = age;
        }
    }
}
