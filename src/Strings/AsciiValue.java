package Strings;
import java.util.Scanner;

public class AsciiValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input a character
        System.out.print("Enter a character: ");
        char inputChar = scanner.next().charAt(0); // Read the first character of the input

        // Get the ASCII value by typecasting the character to an integer
        int asciiValue = (int) inputChar;

        // Print the result
        System.out.println("The ASCII value of '" + inputChar + "' is: " + asciiValue);

        // Close the scanner
        scanner.close();
    }
}
