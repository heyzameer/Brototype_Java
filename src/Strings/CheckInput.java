package Strings;
import java.util.Scanner;

public class CheckInput {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Ask the user for input string
            System.out.println("Enter a string:");
            String input = scanner.nextLine();

            // Check if the string starts with "Hello"
            boolean startsWithHello = input.startsWith("Hello");

            // Check if the string ends with "World!"
            boolean endsWithWorld = input.endsWith("World!");

            // Check if the string is empty
            boolean isEmpty = input.isEmpty();

            // Regex matching: check if the string contains only letters
            String regex = "[a-zA-Z]+";
            boolean containsOnlyLetters = input.matches(regex);

            // Print the results
            System.out.println("Does the string start with \"Hello\"? " + startsWithHello);
            System.out.println("Does the string end with \"World!\"? " + endsWithWorld);
            System.out.println("Is the string empty? " + isEmpty);
            System.out.println("Does the string contain only letters? " + containsOnlyLetters);

            // Close the scanner
            scanner.close();
        }


}
