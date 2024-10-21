package Strings;
import java.util.Scanner;

public class CapitalizeWords {
    public static void main(String[] args) {
        // Create a scanner to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input a sentence
        System.out.print("Enter a sentence: ");
        String inputSentence = scanner.nextLine();

        // Split the sentence into words based on spaces
        String[] words = inputSentence.split("\\s+");

        // StringBuilder to store the updated sentence
        StringBuilder capitalizedSentence = new StringBuilder();

        // Loop through each word and capitalize the first letter
        for (String word : words) {
            // Capitalize the first letter and append the rest of the word
            if (word.length() > 0) {
                capitalizedSentence.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1).toLowerCase())
                        .append(" ");
            }
        }

        // Print the updated sentence with first letters capitalized
        System.out.println("Updated Sentence: " + capitalizedSentence.toString().trim());
    }
}
