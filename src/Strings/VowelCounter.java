package Strings;

import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {
        // Create a scanner to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Call the method to count vowels and store the result
        int vowelCount = countVowels(input);

        // Output the original string and the number of vowels
        System.out.println("Original String: " + input);
        System.out.println("Number of vowels: " + vowelCount);
    }

    // Method to count the number of vowels in a string
    public static int countVowels(String str) {
        int count = 0;
        // Convert the string to lowercase to make it case-insensitive
        str = str.toLowerCase();

        // Loop through each character of the string
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
}

