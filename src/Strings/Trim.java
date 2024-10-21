package Strings;
import java.util.Scanner;

public class Trim {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Ask the user for input string
            System.out.println("Enter a string with extra spaces:");
            String inputString = scanner.nextLine();

            // Trim the input string
            String trimmedString = inputString.trim();

            // Print the trimmed string
            System.out.println("The trimmed string is: \"" + trimmedString + "\"");

            // Close the scanner
            scanner.close();
        }


}
