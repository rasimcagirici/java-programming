package day19_class_vs_object_strings;

import java.time.Instant;

public class LoginTest {
    public static void main(String[] args) {
        String expUserName = "cybertek";
        String expPassword = "Abc123";
        String userName = "CYBERTEK";
        String password = "Abc123";

        if (expUserName.equalsIgnoreCase(userName) && expPassword.equals(password)) {
            System.out.println("Pass - user successfully logged in ");
        } else {
            if (!expUserName.equalsIgnoreCase(userName)) {
                System.out.println("Fail - username incorrect");
            } if (expPassword != password) {
                System.out.println("Fail - password incorrect");
            }
        }
    }
}
