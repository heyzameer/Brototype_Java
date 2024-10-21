package Strings;
import java.util.Scanner;

public class RemoveVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Remove vowels from the string
        String result = removeVowels(input);

        // Print the result
        System.out.println("Output: " + result);

        // Close the scanner
        scanner.close();
    }

    // Method to remove vowels from the input string
    private static String removeVowels(String str) {
        StringBuilder sb = new StringBuilder(); // Use StringBuilder for efficient string manipulation
        for (char c : str.toCharArray()) { // Iterate through each character
            // Check if the character is a vowel
            if (!isVowel(c)) {
                sb.append(c); // Append non-vowel characters to StringBuilder
            }
        }
        return sb.toString(); // Convert StringBuilder to string and return
    }

    // Method to check if a character is a vowel
    private static boolean isVowel(char c) {
        // Convert character to lowercase for case insensitive comparison
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
