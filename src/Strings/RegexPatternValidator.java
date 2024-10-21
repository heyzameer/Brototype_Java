package Strings;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class RegexPatternValidator {
    public static void main(String[] args) {
        // Create a scanner to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input a regex pattern
        System.out.print("Enter a regex pattern: ");
        String regexPattern = scanner.nextLine();

        // Validate the regex pattern
        try {
            // Compile the regex pattern
            Pattern pattern = Pattern.compile(regexPattern);
            System.out.println("The pattern '" + regexPattern + "' is valid.");
        } catch (PatternSyntaxException e) {
            // Handle invalid regex patterns
            System.out.println("The pattern '" + regexPattern + "' is not valid. " + e.getMessage());
        } finally {
            // Close the scanner
            scanner.close();
        }
    }
}
