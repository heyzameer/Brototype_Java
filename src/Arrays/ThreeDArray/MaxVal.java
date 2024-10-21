package Arrays.ThreeDArray;
import java.util.Scanner;

public class MaxVal {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Ask user for dimensions of the 3D array
            System.out.print("Enter the number of layers (depth): ");
            int depth = scanner.nextInt();
            System.out.print("Enter the number of rows: ");
            int rows = scanner.nextInt();
            System.out.print("Enter the number of columns: ");
            int columns = scanner.nextInt();

            // Create the 3D array
            int[][][] array = new int[depth][rows][columns];

            // Populate the array with user input
            for (int d = 0; d < depth; d++) {
                System.out.println("Enter values for Layer " + (d + 1) + ":");
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < columns; j++) {
                        System.out.print("Enter value for element [" + d + "][" + i + "][" + j + "]: ");
                        array[d][i][j] = scanner.nextInt();
                    }
                }
            }

            // Array to store maximum values of each layer
            int[] lmax = new int[depth];

            // Print the 3D array and find maximum values in each layer
            System.out.println("\n3D Array:");
            for (int d = 0; d < depth; d++) {
                System.out.println("Layer " + (d + 1) + ":");
                int max = Integer.MIN_VALUE;  // Initialize max for this layer
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < columns; j++) {
                        System.out.print(array[d][i][j] + " ");
                        if (array[d][i][j] > max) {
                            max = array[d][i][j];  // Update max if current element is greater
                        }
                    }
                    System.out.println();  // Move to the next line after printing a row
                }
                lmax[d] = max;  // Store the max value for this layer
            }

            // Print the maximum values after all layers
            for (int d = 0; d < depth; d++) {
                System.out.println("Maximum value in layer " + (d + 1) + ": " + lmax[d]);
            }

            // Close the scanner
            scanner.close();
        }
    }

