package Strings;
import java.util.Scanner;

public class TripleStringTransformation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input three words
        System.out.print("Enter three words: ");
        String word1 = scanner.next();
        String word2 = scanner.next();
        String word3 = scanner.next();

        // Perform transformations
        String transformedWord1 = replaceVowels(word1);
        String transformedWord2 = replaceConsonants(word2);
        String transformedWord3 = word3.toUpperCase();

        // Concatenate the transformed words
        String result = transformedWord1 + transformedWord2 + transformedWord3;

        // Print the result
        System.out.println("Transformed result: " + result);

        // Close the scanner
        scanner.close();
    }

    // Method to replace vowels with '%'
    private static String replaceVowels(String word) {
        return word.replaceAll("[aeiouAEIOU]", "%");
    }

    // Method to replace consonants with '#'
    private static String replaceConsonants(String word) {
        return word.replaceAll("[^aeiouAEIOU]", "#");
    }
}
