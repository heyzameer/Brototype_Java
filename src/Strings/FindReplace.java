package Strings;
import java.util.Scanner;

public class FindReplace {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Ask the user for a sentence
            System.out.println("Enter a sentence:");
            String sentence = scanner.nextLine();

            // Ask the user for the word to find
            System.out.println("Enter the word to find:");
            String wordToFind = scanner.next();

            // Ask the user for the word to replace with
            System.out.println("Enter the word to replace it with:");
            String wordToReplace = scanner.next();

            // Find the index of the word
            int index = sentence.indexOf(wordToFind);

            // Print the index of the word
            if (index != -1) {
                System.out.println("The word '" + wordToFind + "' is found at index: " + index);
                // Replace the word in the sentence
                String updatedSentence = sentence.replace(wordToFind, wordToReplace);
                System.out.println("Updated Sentence: " + updatedSentence);
            } else {
                System.out.println("The word '" + wordToFind + "' was not found in the sentence.");
            }

            // Close the scanner
            scanner.close();
        }



}
