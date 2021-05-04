package day37_methods_overloading;

public class WarmUpMethod {
    public static void main(String[] args) {
        loginVoid("cybertekStudent", "abc123");
        System.out.println(login("cybertekStudent", "abc123"));
        
        if (login("cybertekStudent","abc123")) {
            System.out.println("login successful");
        } else {
            System.out.println("incorrect username or password");
        }
        
        boolean isLoginSuccess = login("nadir","mountain");
        System.out.println("isLoginSuccess = " + isLoginSuccess);
    }

    public static void loginVoid(String username, String password) {
        String secretUsername = "cybertekStudent";
        String secretPassword = "abc123";
        if (username.equals(secretUsername) && password.equals(secretPassword)) {
            System.out.println("Login successful");
        } else {
            System.out.println("Incorrect username or password");
        }
    }
    public static boolean login(String username, String password) {
        String secretUsername = "cybertekStudent";
        String secretPassword = "abc123";
       if (username.equalsIgnoreCase(secretUsername) && password.equals(secretPassword)) {
           return true;
       }
       return false;
    }
}
