package Arrays.TwoDArray;
import java.util.Scanner;

public class MinElementSumInRows {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Step 3: Define the dimensions of the array
            System.out.print("Enter the number of rows: ");
            int rows = scanner.nextInt();
            System.out.print("Enter the number of columns: ");
            int columns = scanner.nextInt();

            // Step 4: Initialize the 2D array
            int[][] array = new int[rows][columns];

            // Step 5: Loop through the array to take user inputs
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print("Enter value for element [" + i + "][" + j + "]: ");
                    array[i][j] = scanner.nextInt();
                }
            }

            // Step 6: Find min element in each row and calculate their sum
            int sumOfMins = 0;
            for (int i = 0; i < rows; i++) {
                int minInRow = array[i][0]; // Assume the first element is the minimum
                for (int j = 1; j < columns; j++) {
                    if (array[i][j] < minInRow) {
                        minInRow = array[i][j]; // Update min if a smaller element is found
                    }
                }
                sumOfMins += minInRow; // Add the minimum of this row to the sum
            }

            // Print the result
            System.out.println("Sum of minimum elements in each row: " + sumOfMins);

            // Close the scanner
            scanner.close();
        }
    }

