package Strings;
import java.util.Scanner;

public class Palindrome {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Ask the user to input a string
            System.out.println("Enter a string:");
            String inputString = scanner.nextLine();

            // Check if the string is a palindrome
            boolean isPalindrome = isPalindrome(inputString);

            // Print the result
            if (isPalindrome) {
                System.out.println("The string '" + inputString + "' is a palindrome.");
            } else {
                System.out.println("The string '" + inputString + "' is not a palindrome.");
            }

            // Close the scanner
            scanner.close();
        }

        // Method to check if a string is a palindrome
        public static boolean isPalindrome(String str) {
            // Remove spaces and convert to lowercase for a case-insensitive comparison
            String cleanedString = str.replaceAll("\\s+", "").toLowerCase();
            String reversedString = new StringBuilder(cleanedString).reverse().toString();

            return cleanedString.equals(reversedString);
        }


}
