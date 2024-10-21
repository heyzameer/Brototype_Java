package Strings;
import java.util.Scanner;

public class SubString {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Ask user for input strings
            System.out.println("Enter the main string:");
            String mainString = scanner.nextLine();

            System.out.println("Enter the substring to search for:");
            String subString = scanner.nextLine();

            // Check if the substring exists in the main string
            if (mainString.contains(subString)) {
                // Print the result
                System.out.println("The substring '" + subString + "' is found in the main string.");
            } else {
                System.out.println("The substring '" + subString + "' is not found in the main string.");
            }

            // Close the scanner
            scanner.close();
        }
    }


