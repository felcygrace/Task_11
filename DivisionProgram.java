package Task_11;
import java.util.Scanner;

public class DivisionProgram {
    // Method for division
    public static int divide(int numerator, int denominator) {
        // Check if denominator is zero and return -1 if yes
        if (denominator == 0) {
            return -1;
        }
        return numerator / denominator;
    }

    public static void main(String[] args) {
        //get user from user 
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the first number:");
            int numerator = scanner.nextInt();

            System.out.println("Enter the second number:");
            int denominator = scanner.nextInt();

            int output = divide(numerator, denominator);
            if (output == -1) {
                System.out.println("Error: Invalid denominator");
            } else {
                System.out.println("Output: " + output);
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
