package Arrays.ThreeDArray;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the dimensions of the 3D array
        System.out.print("Enter the depth (number of layers): ");
        int depth = scanner.nextInt();
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        // Initialize the 3D array
        int[][][] array = new int[depth][rows][columns];

        // Fill the 3D array with user input
        for (int d = 0; d < depth; d++) {
            System.out.println("Enter values for layer " + (d + 1) + ":");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    array[d][i][j] = scanner.nextInt();
                }
            }
        }

        // Display the 3D array
        System.out.println("3D Array:");
        int[] layerSums = new int[depth]; // To store sums of each layer

        for (int d = 0; d < depth; d++) {
            System.out.println("Layer " + (d + 1) + ":");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    System.out.print(array[d][i][j] + " ");
                    layerSums[d] += array[d][i][j]; // Calculate sum of each layer
                }
                System.out.println(); // Move to the next row
            }
        }

        // Print the sum of each layer after displaying all the layers
        for (int d = 0; d < depth; d++) {
            System.out.println("Sum of layer " + (d + 1) + ": " + layerSums[d]);
        }

        scanner.close();
    }
}

