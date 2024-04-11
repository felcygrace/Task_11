package Task_11;

import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class ValidateAge {
    public static void main(String[] args) {
        // get input from user 
        System.out.println("Please enter the Age: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt(); // geting the age from user 
        sc.close();
       // calling the method in the try catch block 
        try {
            validateAge(age);
            System.out.println("Age is valid.");
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
   // method to check the age is lesser than 18 or not 
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or older.");
        }
    }
}
