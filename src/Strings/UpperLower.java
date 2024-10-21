package Strings;
import java.util.Scanner;

public class UpperLower {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Ask user for input string
            System.out.println("Enter a string:");
            String inputString = scanner.nextLine();

            // Convert to uppercase and lowercase
            String upperCaseString = inputString.toUpperCase();
            String lowerCaseString = inputString.toLowerCase();

            // Print the converted strings
            System.out.println("Uppercase: " + upperCaseString);
            System.out.println("Lowercase: " + lowerCaseString);

            // Close the scanner
            scanner.close();
        }
    }


