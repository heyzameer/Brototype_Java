package Strings;
import java.util.Scanner;

public class StringRotationCheck {
    public static void main(String[] args) {
        // Create a scanner to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input the first string
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        // Ask the user to input the second string
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        // Check if the second string is a rotation of the first
        if (isRotation(str1, str2)) {
            System.out.println("The string '" + str2 + "' is a rotation of '" + str1 + "'.");
        } else {
            System.out.println("The string '" + str2 + "' is not a rotation of '" + str1 + "'.");
        }
    }

    // Method to check if one string is a rotation of another
    public static boolean isRotation(String str1, String str2) {
        // Check if lengths of both strings are the same, if not, return false
        if (str1.length() != str2.length()) {
            return false;
        }

        // Concatenate the first string with itself and check if it contains the second string
        String combined = str1 + str1;
        return combined.contains(str2);
    }
}
