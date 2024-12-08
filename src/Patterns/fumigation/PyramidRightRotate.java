package Patterns.fumigation;

public class PyramidRightRotate {
        public static void main(String[] args) {
            int n = 5; // Height of the pattern (number of rows in the upper half)

            // Combined loop for both upper and lower parts
            for (int i = 1; i <= 2 * n - 1; i++) {
                int row = (i <= n) ? i : (2*n -i); // Determine the current row dynamically

                // Print stars
                for (int j = 1; j <= row; j++) {
                    System.out.print("* ");
                }
                System.out.println(); // Move to the next line
            }
        }
    }
