package Strings;
import java.util.HashSet;
import java.util.Scanner;

public class LongestSubstring {
    public static void main(String[] args) {
        // Create a scanner to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input the string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Get the length of the longest substring without repeating characters
        int length = longestSubstringWithoutRepeating(input);

        // Print the result
        System.out.println("The length of the longest substring without repeating characters is: " + length);
    }

    // Method to find the length of the longest substring without repeating characters
    public static int longestSubstringWithoutRepeating(String s) {
        int n = s.length();
        int maxLength = 0;

        // Use a set to keep track of characters in the current substring
        HashSet<Character> set = new HashSet<>();

        int i = 0, j = 0; // Two pointers
        while (i < n && j < n) {
            // If the character is not in the set, add it and update maxLength
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                maxLength = Math.max(maxLength, j - i);
            } else {
                // If the character is already in the set, remove the character at i and increment i
                set.remove(s.charAt(i++));
            }
        }

        return maxLength;
    }
}
