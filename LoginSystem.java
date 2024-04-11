package Task_11;

import java.util.Scanner;

public class LoginSystem {
    
// custom class that extends exception class 
static class IncorrectPasswordException extends Exception {
    public IncorrectPasswordException(String message) {
        super(message);
    }
   // declaring the username and password 
    private static final String Valid_name = "username";
    private static final String Valid_password = "password";

    public static void main(String[] args) {
        String username = "username";
        System.out.println("Please enter the password: ");
        Scanner sc = new Scanner(System.in);

        String password = sc.next(); // getting input from user 
        sc.close();

        try {
            login(username, password);
            System.out.println("Login successful!");
        } catch (IncorrectPasswordException e) {
            System.out.println("Login failed: " + e.getMessage());
        }
    }
   // method for login functionality 
    public static void login(String username, String password) throws IncorrectPasswordException {
        if (!username.equals(Valid_name) || !password.equals(Valid_password)) {
            throw new IncorrectPasswordException("Incorrect password!");
        }
    
    }
}
}
