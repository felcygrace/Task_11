package Task_11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileNotFound {
    public static void main(String[] args) {
        try {
            // Specify the path to the file
            String filePath = "C:/Users/FELCY/Desktop/JAT_MARCH/Task_11/Test1.txt"; 

            // Attempt to open the file
            File file = new File(filePath);
            Scanner sc = new Scanner(file);

            // Read data from the file
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            

            // Close the scanner
            sc.close();
        } catch (FileNotFoundException e) {
            // Handle the FileNotFoundException
            System.out.println("Error: File not found! " + e.getMessage());
        }
    }
}
