package Patterns.fumigation;

public class LReverseNum_1 {
        public static void main(String[] args) {
            int n = 4; // Number of rows
            int num = 1; // Starting number

            for (int i = 1; i <= n; i++) {
                int[] row = new int[i]; // Array to store numbers in the current row

                // Fill the row with increasing numbers
                for (int j = 0; j < i; j++) {
                    row[j] = num++;
                }

                // Print the row based on its order (odd or even)
                if (i % 2 == 0) { // Even row (reverse order)
                    for (int j = i - 1; j >= 0; j--) {
                        System.out.print(row[j] + "\t");
                    }
                } else { // Odd row (normal order)
                    for (int j = 0; j < i; j++) {
                        System.out.print(row[j] + "\t");
                    }
                }

                // Move to the next line
                System.out.println();
            }
        }
    }
