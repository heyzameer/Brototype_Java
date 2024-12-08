package Patterns.fumigation;

public class PyramidEmptySpace_2 {
    public static void main(String[] args) {
        int n = 5; // Number of rows (can be changed for generalization)

        for (int i = 1; i <= n; i++) { // Row loop
            for (int j = 1; j <= 2 * n - 1; j++) { // Column loop
                // Condition to print stars or spaces
                if (j <= i || j >= 2*n-1-i+1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
