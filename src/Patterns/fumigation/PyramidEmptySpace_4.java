package Patterns.fumigation;

public class PyramidEmptySpace_4 {
    public static void main(String[] args) {
        int n = 5; // Number of rows (generalized)

        for (int i = 1; i <= 2 * n; i++) { // Combined loop for both patterns
            for (int j = 1; j <= 2 * n - 1; j++) { // Columns remain the same

                if (i <= n) {
                    // Upper pattern condition
                    if (j <= n + 1 - i || j >= n - 1 + i) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    // Lower pattern condition
                    if (j <= i - n || j >=2*n-1-(i-n)+1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
