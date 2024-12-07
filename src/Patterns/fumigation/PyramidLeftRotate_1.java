package Patterns.fumigation;

public class PyramidLeftRotate_1 {
    public static void main(String[] args) {
        int n = 5;

        // Single loop for both patterns with ternary operator
        for (int i = 0; i < 2 * n - 1; i++) {
            int spaces = (i < n) ? (n - i - 1) : (i - n + 1);       // Calculate spaces
            int stars = (i < n) ? (i + 1) : (2 * n - i - 1);        // Calculate stars

            // Print spaces
            for (int j = 0; j < spaces; j++) {
                System.out.print("  ");
            }
            // Print stars
            for (int j = 0; j < stars; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
