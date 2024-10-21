package Strings;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PalindromeSwapping {

    // Function to check if a string can be rearranged to form a palindrome
    private static boolean canFormPalindrome(String str) {
        Map<Character, Integer> charCount = new HashMap<>();

        // Count the frequency of each character
        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        int oddCount = 0;
        // Check the counts of characters
        for (int count : charCount.values()) {
            if (count % 2 != 0) {
                oddCount++;
            }
        }

        // A string can form a palindrome if it has at most one character with an odd count
        return oddCount <= 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Check if the string can be rearranged to form a palindrome
        if (canFormPalindrome(inputString)) {
            System.out.printf("The string '%s' can be rearranged to form a palindrome.%n", inputString);
        } else {
            System.out.printf("The string '%s' cannot be rearranged to form a palindrome.%n", inputString);
        }

        // Close the scanner
        scanner.close();
    }
}
