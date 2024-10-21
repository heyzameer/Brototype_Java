package Strings;
import java.util.Scanner;

public class ToggleCase {

    // Function to toggle the case of each word in the string
    private static String toggleEachWord(String str) {
        String[] words = str.split(" ");
        StringBuilder toggledString = new StringBuilder();

        for (String word : words) {
            StringBuilder toggledWord = new StringBuilder();

            // Toggle the case for each character in the word
            for (char c : word.toCharArray()) {
                if (Character.isUpperCase(c)) {
                    toggledWord.append(Character.toLowerCase(c));
                } else {
                    toggledWord.append(Character.toUpperCase(c));
                }
            }

            // Append the toggled word to the result string
            toggledString.append(toggledWord).append(" ");
        }

        // Trim the final string to remove the trailing space
        return toggledString.toString().trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Toggle the case for each word in the string
        String result = toggleEachWord(inputString);

        // Print the toggled string
        System.out.println("Toggled String: " + result);

        // Close the scanner
        scanner.close();
    }
}
//Toggle Each Word in String
//
//Write a Java program that toggles the case of each character in a string such that:
//
//The first character of every word is converted to uppercase if it's lowercase, and to lowercase if it's uppercase.
//
//The rest of the characters of each word are also toggled (uppercase becomes lowercase and vice versa).
//
//Your program should:
//
//Ask the user to input a string.
//
//Toggle the case for each word in the string.
//
//Print the toggled string.
//
//Sample Input:
//hello World
//Sample Output:
//HELLO wORLD