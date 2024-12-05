package Patterns.fumigation;

public class LReverseNum_2 {

        public static void main(String[] args) {
            int n = 4; // Number of rows
            int num = 1; // Starting number

            for (int row = 1; row <= n; row++) {
                if (row % 2 == 0) {
                    // For even rows, calculate the starting number of the row and print in reverse
                    int start = num + row - 1;
                    for (int col = 0; col < row; col++) {
                        System.out.print(start-- + "\t");
                    }
                } else {
                    // For odd rows, print numbers in normal order
                    for (int col = 0; col < row; col++) {
                        System.out.print(num++ + "\t");
                    }
                }
                // Update the starting number for the next row
                if (row % 2 == 0) {
                    num += row;
                }
                System.out.println();
            }
        }
}
