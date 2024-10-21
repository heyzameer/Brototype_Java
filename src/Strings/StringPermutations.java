package Strings;
import java.util.Scanner;

public class StringPermutations {

    // Function to generate permutations
    private static void permute(String str, String perm) {
        if (str.isEmpty()) {
            System.out.print(perm + " ");
        } else {
            for (int i = 0; i < str.length(); i++) {
                // Choose the current character and permute the rest
                permute(str.substring(0, i) + str.substring(i + 1), perm + str.charAt(i));
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Generate and print all permutations
        System.out.print("Permutations: ");
        permute(inputString, "");

        // Close the scanner
        scanner.close();
    }
}
