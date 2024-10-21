package Arrays.TwoDArray;
import java.util.Scanner;

public class UserInput2DArray {
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

        // Optional: Display the array
        System.out.println("The 2D array you entered is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        // Close the scanner
        scanner.close();
    }
}
