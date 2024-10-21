package Strings;
import java.util.Scanner;

public class ReverseStringWithoutTemp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Reverse the string
        String reversed = reverseString(input);

        // Print the result
        System.out.println("Reversed String: " + reversed);

        // Close the scanner
        scanner.close();
    }

    // Method to reverse the string without using a temporary variable
    private static String reverseString(String str) {
        char[] charArray = str.toCharArray(); // Convert string to char array
        int left = 0; // Starting index
        int right = charArray.length - 1; // Ending index

        while (left < right) {
            // Reverse without using a temporary variable
            charArray[left] = (char) (charArray[left] + charArray[right]);
            charArray[right] = (char) (charArray[left] - charArray[right]);
            charArray[left] = (char) (charArray[left] - charArray[right]);

            left++; // Move towards the center
            right--; // Move towards the center
        }

        return new String(charArray); // Convert char array back to string
    }
}
