package Strings;
import java.util.Scanner;

public class RemoveWhitespaces {
    public static void main(String[] args) {
        // Create a scanner to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input a string
        System.out.print("Enter a string: ");
        String originalString = scanner.nextLine();

        // Remove all whitespace characters using replaceAll() method
        String modifiedString = originalString.replaceAll("\\s", "");

        // Print the original and modified strings
        System.out.println("Original String: " + originalString);
        System.out.println("Modified String: " + modifiedString);
    }
}
