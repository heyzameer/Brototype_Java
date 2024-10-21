package Strings;
import java.util.Scanner;

public class CountOccurence {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Ask the user to input a string
            System.out.println("Enter a string:");
            String inputString = scanner.nextLine();

            // Ask the user to input a character
            System.out.println("Enter a character to count:");
            char targetChar = scanner.next().charAt(0);

            // Count occurrences of the character
            int count = countOccurrences(inputString, targetChar);

            // Print the results
            System.out.println("Original String: " + inputString);
            System.out.println("Character: " + targetChar);
            System.out.println("Occurrences: " + count);

            // Close the scanner
            scanner.close();
        }

        // Method to count occurrences of a character in a string
        public static int countOccurrences(String str, char ch) {
            int count = 0;

            // Loop through the string to count occurrences of the character
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch) {
                    count++;
                }
            }

            return count;
        }


}
