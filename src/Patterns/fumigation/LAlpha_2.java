package Patterns.fumigation;

public class LAlpha_2 {
    public static void main(String[] args) {
        int n = 5; // Number of rows

        for (int i = 0; i < n; i++) {
            // Determine the character to print (A + i)
            char ch = (char) ('A' + i);
            for (int j = 0; j <= i; j++) {
                System.out.print(ch); // Print the character
            }
            System.out.println(); // Move to the next line
        }
    }
}
