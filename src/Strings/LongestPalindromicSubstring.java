package Strings;
import java.util.Scanner;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Find the longest palindromic substring
        String longestPalindrome = findLongestPalindrome(input);

        // Print the result
        System.out.println("Longest palindromic substring: " + longestPalindrome);

        // Close the scanner
        scanner.close();
    }

    // Method to find the longest palindromic substring
    private static String findLongestPalindrome(String s) {
        if (s == null || s.length() == 0) {
            return "";
        }

        String longest = "";
        for (int i = 0; i < s.length(); i++) {
            // Check for odd-length palindromes
            String oddPalindrome = expandAroundCenter(s, i, i);
            if (oddPalindrome.length() > longest.length()) {
                longest = oddPalindrome;
            }
            // Check for even-length palindromes
            String evenPalindrome = expandAroundCenter(s, i, i + 1);
            if (evenPalindrome.length() > longest.length()) {
                longest = evenPalindrome;
            }
        }
        return longest;
    }

    // Helper method to expand around the center and find palindromes
    private static String expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }
}
