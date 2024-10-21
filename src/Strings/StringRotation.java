package Strings;
import java.util.Scanner;

public class StringRotation {
    public static void main(String[] args) {
        // Create a scanner to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Ask the user for the number of positions to rotate
        System.out.print("Enter number of positions to rotate: ");
        int positions = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Ask the user for the direction of rotation
        System.out.print("Enter direction (left/right): ");
        String direction = scanner.nextLine().toLowerCase();

        // Perform rotation based on the direction
        String rotatedString;
        if (direction.equals("left")) {
            rotatedString = rotateLeft(input, positions);
        } else if (direction.equals("right")) {
            rotatedString = rotateRight(input, positions);
        } else {
            rotatedString = "Invalid direction!";
        }

        // Output the resulting rotated string
        System.out.println("Rotated String: " + rotatedString);
    }

    // Method to rotate the string to the left
    public static String rotateLeft(String str, int positions) {
        positions = positions % str.length(); // Handle cases where positions > length
        return str.substring(positions) + str.substring(0, positions);
    }

    // Method to rotate the string to the right
    public static String rotateRight(String str, int positions) {
        positions = positions % str.length(); // Handle cases where positions > length
        return str.substring(str.length() - positions) + str.substring(0, str.length() - positions);
    }
}
