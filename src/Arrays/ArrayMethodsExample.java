package Arrays;
import java.util.Arrays;

public class ArrayMethodsExample {
    public static void main(String[] args) {
        // 1. Sorting
        int[] numbers = {5, 3, 8, 1, 2};
        Arrays.sort(numbers);
        System.out.println("Sorted Array: " + Arrays.toString(numbers)); // Output: [1, 2, 3, 5, 8]

        // 2. Searching
        int index = Arrays.binarySearch(numbers, 5); // Search for 5
        System.out.println("Index of 5: " + index); // Output: Index of 5: 3

        // 3. Filling
        int[] fillArray = new int[5];
        Arrays.fill(fillArray, 7);
        System.out.println("Filled Array: " + Arrays.toString(fillArray)); // Output: [7, 7, 7, 7, 7]

        // 4. Copying
        int[] originalArray = {1, 2, 3, 4, 5};
        int[] copiedArray = Arrays.copyOf(originalArray,3);
        System.out.println("Copied Array: " + Arrays.toString(copiedArray)); // Output: [1, 2, 3]

        // 5. Comparing
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        boolean areEqual = Arrays.equals(array1, array2);
        System.out.println("Arrays are equal: " + areEqual); // Output: Arrays are equal: true

        // 6. Converting to String
        String arrayString = Arrays.toString(array1);
        System.out.println("Array as String: " + arrayString); // Output: Array as String: [1, 2, 3, 4, 5]

        // 7. Deep To String for Multi-dimensional Arrays
        int[][] multiArray = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        String multiArrayString = Arrays.deepToString(multiArray);
        System.out.println("Multi-dimensional Array as String: " + multiArrayString); // Output: [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
    }
}
