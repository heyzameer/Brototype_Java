package Arrays.ThreeDArray;

import java.util.Scanner;

public class AverageOfRow {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int depth = scanner.nextInt();
            int rows = scanner.nextInt();
            int columns = scanner.nextInt();

            int[][][] array = new int[depth][rows][columns];

            // Populating the 3D array
            for (int d = 0; d < depth; d++) {
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < columns; j++) {
                        array[d][i][j] = scanner.nextInt();
                    }
                }
            }

            // Displaying the 3D Array
            System.out.println("3D Array:");
            for (int d = 0; d < depth; d++) {
                System.out.println("Layer " + (d + 1) + ":");
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < columns; j++) {
                        System.out.print(array[d][i][j] + " ");
                    }
                    System.out.println();
                }
            }

            System.out.println();

            // Calculate and print the average of each column
            for (int i = 0; i < rows; i++) { // Loop over rows first
                for (int j = 0; j < columns; j++) { // Then loop over columns
                    int sum = 0;
                    for (int d = 0; d < depth; d++) {
                        sum += array[d][i][j];
                    }
                    double average = (double) sum / depth;
                    System.out.println("Average of column (" + i + "," + j + "): " + average);
                }
            }

            scanner.close();
        }
    }

