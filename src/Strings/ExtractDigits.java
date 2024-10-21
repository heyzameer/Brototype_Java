package Strings;
import java.util.Scanner;

public class ExtractDigits {
    public static void main(String[] args) {
        // Create a scanner to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // StringBuilder to store the extracted digits
        StringBuilder digits = new StringBuilder();

        // Loop through the string to extract digits
        for (char c : inputString.toCharArray()) {
            if (Character.isDigit(c)) {
                digits.append(c);
            }
        }

        // Print the extracted digits
        System.out.println("Extracted Digits: " + digits.toString());
    }
}
