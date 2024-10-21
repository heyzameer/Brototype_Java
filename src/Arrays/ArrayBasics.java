package Arrays;

public class ArrayBasics {
    public static void main(String[] args) {
        // Declare and initialize an array
        int[] numbers = {5, 10, 15, 20, 25};
// 1. Declaration without initialization
        int[] numbers1;
        numbers1 = new int[5]; // Initialize array with size 5


        // 2. Declaration and initialization in one line
        int[] numbers2 = new int[5];

        // 3. Initialization with values
        int[] numbers3 = {1, 2, 3, 4, 5}; // Creates an array with specified values

        // 4. Using new keyword with specified values
        int[] numbers4 = new int[]{6, 7, 8, 9, 10}; // Creates and initializes the array

        // Accessing elements
        System.out.println("First element: " + numbers[0]); // 5
        System.out.println("Second element: " + numbers[1]); // 10

        // Modifying an element
        numbers[2] = 30; // Changing 15 to 30
        System.out.println("Modified third element: " + numbers[2]); // 30

        // Length of the array
        System.out.println("Length of the array: " + numbers.length); // 5

        // Iterating through the array using a for loop
        System.out.println("Using for loop:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Iterating through the array using for-each loop
        System.out.println("Using for-each loop:");
        for (int number : numbers) {
            System.out.println(number);
        }

        // Declaring and initializing a two-dimensional array
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Accessing elements in a two-dimensional array
        System.out.println("Element at matrix[1][2]: " + matrix[1][2]); // 6

        // Iterating through a two-dimensional array
        System.out.println("Two-dimensional array:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // New line for each row
        }
    }
}
