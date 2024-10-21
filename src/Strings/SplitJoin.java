package Strings;
import java.util.Scanner;

public class SplitJoin {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Ask the user for a sentence
            System.out.println("Enter a sentence:");
            String sentence = scanner.nextLine();

            // Ask the user for a delimiter to join the words
            System.out.println("Enter a delimiter to join the words:");
            String delimiter = scanner.next();

            // Split the sentence into words using space as the delimiter
            String[] words = sentence.split(" ");

            // Print the split words
            System.out.println("Split words:");
            for (String word : words) {
                System.out.println(word);
            }

            // Join the words back together using the specified delimiter
            String joinedSentence = String.join(delimiter, words);
            System.out.println("Joined sentence: " + joinedSentence);

            // Close the scanner
            scanner.close();

    }

}
